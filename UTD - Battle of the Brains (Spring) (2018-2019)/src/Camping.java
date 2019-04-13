import java.math.BigInteger;
import java.util.Scanner;

public class Camping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int caseNum = 0; caseNum < cases; caseNum++) {
            int rows = scanner.nextInt(), columns = scanner.nextInt();
            char[][] grid = new char[rows][columns];
            for (int y = 0; y < rows; y++) {
                String line = scanner.next();
                for (int x = 0; x < columns; x++) {
                    grid[y][x] = line.charAt(x);
                }
            }
            boolean works = true;
            outer: for (int y = 0; y < grid.length; y++) {
                for (int x = 0; x < grid[y].length; x++) {
                    if (grid[y][x] == 't') {
                        works = validate(grid, y, x);
                        if (!works) {
                            break outer;
                        }
                    }
                }
            }
            if (works) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    private static boolean validate(char[][] grid, int y, int x) {
        int[][] offsets = {
                {-1, -1},
                {-1, 0},
                {-1, 1},
                {0, -1},
                {0, 1},
                {1, -1},
                {1, 0},
                {1, 1}
        };
        for (int[] offset : offsets) {
            Character loc = getGrid(grid, y + offset[0], x + offset[1]);
            if (loc != null) {
                if (loc == 't') {
                    return false;
                }
            }
        }
        return true;
    }

    private static Character getGrid(char[][] grid, int y, int x) {
        try {
            return grid[y][x];
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }
}
