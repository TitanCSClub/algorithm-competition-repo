import java.util.*;

public class Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int caseNum = 0; caseNum < cases; caseNum++) {
            int totalCards = scanner.nextInt();
            int andrewStart = scanner.nextInt();
            int sammyStart = scanner.nextInt();
            Map<Integer, Node> nodes = new HashMap<>();
            Node[] andrew = new Node[andrewStart];
            Node[] sammy = new Node[sammyStart];
            for (int i = 1; i <= totalCards; i++) {
                nodes.put(i, new Node(i));
            }
            for (int i = 0; i < andrewStart; i++) {
                andrew[i] = nodes.get(scanner.nextInt());
            }
            for (int i = 0; i < sammyStart; i++) {
                sammy[i] = nodes.get(scanner.nextInt());
            }
            scanner.nextLine();
            for (int i = 1; i <= totalCards; i++) {
                String line = scanner.nextLine();
                if (line.equals("-1")) {
                    continue;
                }
                int[] split = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
                Node node = nodes.get(i);
                for (int j : split) {
                    Node o = nodes.get(j);
                    o.connections.add(node);
                }
            }
            List<Node> sammyList = new ArrayList<>(Arrays.asList(sammy));
            Set<Node> visited = new HashSet<>();
            for (Node node : andrew) {
                traverse(node, visited, sammyList);
            }
            if (sammyList.isEmpty()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }



    private static boolean traverse(Node root, Set<Node> visited, List<Node> goals) {
        LinkedList<Node> nodesToVisit = new LinkedList<>();
        nodesToVisit.add(root);
        while (!nodesToVisit.isEmpty()) {
            Node node = nodesToVisit.remove();
            visited.add(node);
            if (goals.contains(node)) {
                goals.remove(node);
                return true;
            }
            for (Node neighbor : node.connections) {
                if (!visited.contains(neighbor) && !nodesToVisit.contains(neighbor)) {
                    nodesToVisit.add(neighbor);
                }
            }
        }
        return false;
    }

    private static class Node {
        private final int id;
        private final List<Node> connections;

        Node(int id) {
            this.id = id;
            connections = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Node " + id;
        }
    }
}
