import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Not submitted
 */
public class prob13 {
    private static final String FILE_NAME = "prob13.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File(FILE_NAME));
        int sites = console.nextInt();
        for (int i = 0; i < sites; i++) {
            int numSpots = console.nextInt();
            int[][] spots = new int[numSpots][3];
            // for (int j = 0; j < )
            int numRows = console.nextInt();
            int numCols = console.nextInt();
            console.nextLine();
            int numStudents = 0;
            char[][] grid = new char[numRows][numCols];
            for (int j = 0; j < numRows; j++) {
                String nextLine = console.nextLine();
                String[] charArr = nextLine.split(" ");
                for (int k = 0; k < numCols; k++) {
                    if (charArr[k].equals("#")) {
                        numStudents++;
                    }
                    grid[j][k] = charArr[k].charAt(k);
                }
            }
            int[][] studentLocs = new int[numStudents][2];
            for (int j = 0; j < numRows; j++) {
                for (int k = 0; k < numCols; k++) {
                    if (grid[j][k] == '#') {
                        int[] loc = {j, k};
                    }
                }
            }
            boolean[] covered = new boolean[numStudents];
            for (int w = 0; w < spots.length; w++) {
                for (int h = 0; h < studentLocs.length; h++) {
                    //if (Math.sqrt(Math.pow(studentLoc)))
                }
            }
            out.println("Site " + (i + 1) + ": ");
        }
    }
}
