import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Correct for 4 points
 */
public class prob04 {
    private static final String FILE_NAME = "prob04.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File(FILE_NAME));
        int cases = console.nextInt();
        for (int i = 0; i < cases; i++) {
            int goldStart = console.nextInt();
            int silverStart = console.nextInt();
            int bronzeStart = console.nextInt();
            int totalBronze = goldStart * 50 + silverStart * 5 + bronzeStart;
            int gold = totalBronze / 50;
            if (totalBronze % 50 == 0) {
                out.println((gold - 1) + " " + 9 + " " + 5);
            } else {
                int totLeft = totalBronze % 50;
                int silver = totLeft / 5;
                if (totLeft % 5 == 0) {
                    out.println(gold + " " + (silver - 1) + " " + 5);
                } else {
                    out.println(gold + " " + silver + " " + totLeft % 5);
                }
            }
        }
    }
}
