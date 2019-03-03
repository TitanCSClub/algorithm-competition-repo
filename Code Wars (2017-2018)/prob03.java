import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Correct for 4 points
 */
public class prob03 {
    private static final String FILE_NAME = "prob03.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));
        while (in.hasNext()) {
            String num = in.next();
            if (!num.equals("0")) {
                boolean magn = true;
                for (int i = 1; i < num.length(); i++) {
                    int first = Integer.parseInt(num.substring(0, i));
                    int sec = Integer.parseInt(num.substring(i));
                    BigInteger tot = new BigInteger(first + sec + "");
                    BigInteger nextOne = new BigInteger(Integer.parseInt(tot.toString()) - 1 + "");
                    BigInteger toCheck = nextOne.nextProbablePrime();

                    if (!tot.equals(toCheck) || first + sec == 1) {
                        magn = false;
                        break;
                    }
                }
                if (magn) {
                    out.println(num + " MAGNANIMOUS");
                } else {
                    out.println(num + " PETTY");
                }
            }
        }
    }
}
