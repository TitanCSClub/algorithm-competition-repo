import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Gowri {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("gowri.dat"))) {
            int cases = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < cases; i++) {
                int num = scanner.nextInt();
                String[][] grid = new String[8 + num][8 + num];
                for (int r = 0; r < grid.length; r++) {
                    for (int c = 0; c < grid[r].length; c++) {
                        grid[r][c] = " ";
                    }
                }
                for (int col = 4; col < (4 + num); col++) {
                    grid[0][col] = "*";
                }

                grid[1][3] = "*";
                grid[2][2] = "*";
                grid[3][1] = "*";
                grid[1][4 + num] = "*";
                grid[2][5 + num] = "*";
                grid[3][6 + num] = "*";

                for (int r = 4; r < (4 + num); r++) {
                    grid[r][0] = "*";
                    grid[r][num + 7] = "*";
                }

                grid[4+num][1] = "*";
                grid[5+num][2] = "*";
                grid[6+num][3] = "*";
                grid[4+num][6 + num] = "*";
                grid[5+num][5 + num] = "*";
                grid[6+num][4 + num] = "*";

                for (int col = 4; col < (4 + num); col++) {
                    grid[7 + num][col] = "*";
                }
                for (String[] strings : grid) {
                    for (String string : strings) {
                        System.out.print(string);
                    }
                    System.out.println();
                }
                for (int i1 = 0; i1 < 20; i1++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
