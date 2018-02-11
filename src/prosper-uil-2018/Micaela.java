import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Correct!! THE MOST CLUTCH ANSWER BY EMILY
 */
public class Micaela {
    private static final String FILE_NAME = "micaela.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        while (in.hasNext()) {
            String one = in.next();
            String two = in.next();
            int[][] grid = new int[one.length() + 1][two.length() + 1];

            for (int r = 1; r < grid.length; r++) {
                for (int c = 1; c < grid[0].length; c++) {
                    if (one.charAt(r - 1) == two.charAt(c - 1)) {
                        grid[r][c] = grid[r - 1][c - 1] + 1;
                    } else {
                        grid[r][c] = Math.max(grid[r - 1][c], grid[r][c - 1]);
                    }
                }
            }
            //out.println(grid[grid.length-1][grid[0].length-1]);
            if (grid[grid.length - 1][grid[0].length - 1] == 0) {
                out.println("NONE");
            } else {

                int r = grid.length - 1;
                int c = grid[0].length - 1;
                boolean going = true;
                String fin = "";
                while (going) {
                    if (r == 0 || c == 0) {
                        going = false;
                    } else {
                        if (one.charAt(r - 1) == two.charAt(c - 1)) {
                            fin = one.charAt(r - 1) + fin;
                            r = r - 1;
                            c = c - 1;
                        } else {
                            if (grid[r][c] == grid[r - 1][c]) {
                                r = r - 1;
                            } else {
                                c = c - 1;
                            }
                        }
                    }
                }
                out.println(fin);
            }
        }
    }
}
