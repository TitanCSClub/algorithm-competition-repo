import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class BlackOp {

    private static HashMap<Integer, Node> nodes = new HashMap<>();
    private static HashMap<Coord, Integer> nodeCoords = new HashMap<>();

    // [y][x] not [x][y]
    private static String[][] grid = null;
    private static Node start = null;
    private static Node goal = null;

    private static class Coord {
        int x, y;

        Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object object) {
            if (!(object instanceof Coord)) {
                return false;
            }

            Coord otherCoord = (Coord) object;
            return this.x == otherCoord.x && this.y == otherCoord.y;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + Integer.valueOf(this.x).hashCode();
            result = 31 * result + Integer.valueOf(this.y).hashCode();
            return result;
        }
    }

    /**
     * ############
     * #       # X#
     * # ## ## # ##
     * #@## #  # ##
     * #   ## ## ##
     * ###   ### ##
     * #####      #
     * ############
     * <p>
     * X = (1, 11)
     *
     * @ = (7, 11)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < cases; i++) {
            int rows = scanner.nextInt();
            int columns = scanner.nextInt();
            scanner.nextLine();
            grid = new String[rows][columns];
            for (int y = 0; y < grid.length; y++) {
                String[] line = scanner.nextLine().split("");
                for (int x = 0; x < grid[y].length; x++) {
                    grid[y][x] = line[x];
                    if (!line[x].equals("#")) {
                        counter++;
                        Node node = new Node(counter, x, y);
                        if (line[x].equals("X")) {
                            goal = node;
                        } else if (line[x].equals("@")) {
                            start = node;
                        }
                        nodes.put(node.id, node);
                        nodeCoords.put(new Coord(x, y), node.id);
                    }
                }
            }
            performProgram();
            retracePath(goal);
            for (int y = 0; y < grid.length; y++) {
                for (int x = 0; x < grid[y].length; x++) {
                    System.out.print(grid[y][x]);
                }
                System.out.println();
            }
            /*for (int y = 0; y < grid.length; y++) {
                for (int x = 0; x < grid[y].length; x++) {
                    System.out.print(nodeCoords.get(new Coord(x, y)) != null ? nodeCoords.get(new Coord(x, y)) : grid[y][x]);
                }
                System.out.println();
            }*/
        }

    }

    private static void performProgram() {
        LinkedList<Node> nextToVisit = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        Node previous = start;

        for (Integer integer : nodes.keySet()) {
            addAdjacentNodes(nodes.get(integer));
        }

        nextToVisit.add(start);
        while (!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();

            if (node == goal) {
                return;
            }

            visited.add(node.id);
            for (Node child : node.adjacent) {
                if (!visited.contains(child.id)) {
                    nextToVisit.add(child);
                    child.previous = node;
                }
            }
        }
    }

    private static void retracePath(Node node) {
        if (node != null) {
            grid[node.y][node.x] = (node.id == start.id) ? "@" : (node.id == goal.id) ? "X" : ".";
            retracePath(node.previous);
        }
    }

    private static void addAdjacentNodes(Node node) {
        int[][] checks = {
                {-1, 0},
                {1, 0},
                {0, 1},
                {0, -1},
        };
        for (int i = 0; i < checks.length; i++) {
            if (isLegal(node.x + checks[i][0], node.y + checks[i][1])) {
                Node otherNode = getNode(node.x + checks[i][0], node.y + checks[i][1]);
                if (otherNode != null) {
                    addEdge(node.id, otherNode.id);
                }
            }
        }
    }

    private static Node getNode(int x, int y) {
        return nodes.get(nodeCoords.get(new Coord(x, y)));
    }

    private static Node getNode(int id) {
        return nodes.get(id);
    }

    private static void addEdge(int source, int destination) {
        getNode(source).adjacent.add(getNode(destination));
    }

    private static class Node {
        int id;
        int x, y;
        LinkedList<Node> adjacent = new LinkedList<>();
        Node previous = null;

        Node(int id, int x, int y) {
            this.id = id;
            this.x = x;
            this.y = y;
        }
    }

    private static boolean isLegal(int x, int y) {
        return x >= 0 && x < grid[0].length && y >= 0 && y < grid.length && !grid[y][x].equals("#");
    }
}