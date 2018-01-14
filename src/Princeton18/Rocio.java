package Princeton18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Complete
 */
public class Rocio {
    private static final String FILE_NAME = "rocio.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        while (in.hasNext()) {
            int A = in.nextInt();
            int B = in.nextInt();

            char[][] patt = new char[A][A];

            for (int i = 0; i < B; i++) {
                patt[i][i] = '*';
                patt[i][patt[0].length - 1 - i] = '*';
                patt[patt.length - 1 - i][i] = '*';
                patt[patt.length - 1 - i][patt[0].length - 1 - i] = '*';
            }


            for (int r = B; r < A - B; r++) {
                for (int c = B; c < A - B; c++) {
                    patt[r][c] = '*';
                }
            }


            for (int r = 0; r < patt.length; r++) {
                for (int c = 0; c < patt[0].length; c++) {
                    if (patt[r][c] != '*') {
                        patt[r][c] = ' ';
                    }
                    out.print(patt[r][c]);
                }
                out.println();
            }


            for (int a = 0; a < A; a++) {
                out.print("=");
            }

            out.println();


        }

    }
}
