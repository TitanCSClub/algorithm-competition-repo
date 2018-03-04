import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Correct for 6 points
 */
public class prob10 {
    private static final String FILE_NAME = "prob10.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        int cases = in.nextInt();
        for (int ca = 0; ca < cases; ca++) {
            int stonesTop = in.nextInt();
            int SL1 = (int) (Math.sqrt(stonesTop));
            int height = in.nextInt();
            if (height == 0) {
                out.println("0 liters");
            } else {
                int lits = 0;
                int SL = SL1;
                for (int i = 0; i < height; i++) {
                    if (i == 0) {
                        lits += SL * 4 + SL * SL;
                    } else {
                        lits += SL * 4 + SL * SL - (SL - 1) * (SL - 1);
                    }
                    SL++;
                }
                out.println(lits + " liters");
            }

        }
    }
}
