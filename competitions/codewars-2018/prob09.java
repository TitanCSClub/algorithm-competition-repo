import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Correct for 5 points
 */
public class prob09 {
    private static final String FILE_NAME = "prob09.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            String binary = Integer.toBinaryString(num);
            char[] splitBinary = binary.toCharArray();
            int zeroes = 0;
            int ones = 0;
            for (char c : splitBinary) {
                if (c == '0') {
                    zeroes++;
                } else {
                    ones++;
                }
            }
            if (ones > zeroes) {
                System.out.println(num + " HEAVY");
            } else if (zeroes > ones) {
                System.out.println(num + " LIGHT");
            } else {
                System.out.println(num + " BALANCED");
            }
        }
        /*int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {

        }*/
    }
}
