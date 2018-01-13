import java.util.Scanner;

public class Main {
    // [y][x], not [x][y]
    private static String[][] grid = new String[15][30];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int y = 0; y < 15; y++) {
            String[] row = scanner.nextLine().split("");
            for (int x = 0; x < 30; x++) {
                grid[y][x] = row[x];
            }
        }
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                String character = grid[y][x];
                if (!character.equals("*")) {
                    int numberOfMines = getSurroundingMines(x, y);
                    grid[y][x] = numberOfMines == 0 ? "." : numberOfMines + "";
                }
            }
        }
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                System.out.print(grid[y][x]);
            }
            System.out.println();
        }
    }

    private static int getSurroundingMines(int x, int y) {
        int mines = 0;
        boolean[] checks = {
                check(x - 1, y),
                check(x + 1, y),
                check(x, y - 1),
                check(x, y + 1),
                check(x - 1, y - 1),
                check(x - 1, y + 1),
                check(x + 1, y - 1),
                check(x + 1, y + 1)
        };
        for (int i = 0; i < checks.length; i++) {
            if (checks[i]) {
                mines++;
            }
        }
        return mines;
    }

    private static boolean check(int x, int y) {
        return isLegal(x, y) && isMine(grid[y][x]);
    }

    private static boolean isLegal(int x, int y) {
        return x >= 0 && x < 30 && y >= 0 && y < 15;
    }

    private static boolean isMine(String character) {
        return character.equals("*");
    }
}
    