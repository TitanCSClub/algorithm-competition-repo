package Princeton18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Complete
 */
public class Linus {
    private static final String FILE_NAME = "linus.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int num = in.nextInt();
            int denom = in.nextInt();
            if (num == 0) {
                out.println(0);
            } else {
                int gcd = gcd(num, denom);
                int newNum = num / gcd;
                int newDenom = denom / gcd;
                if (newNum < newDenom) {
                    out.println(newNum + "/" + newDenom);
                } else if (newNum % newDenom == 0) {
                    out.println(newNum / newDenom);
                } else {
                    out.println(newNum / newDenom + " " + (newNum % newDenom) + "/" + newDenom);
                }
            }
        }
    }

    public static int gcd(int num1, int num2) {
        if (Math.max(num1, num2) % Math.min(num1, num2) == 0) {
            return Math.min(num1, num2);
        } else {
            return gcd(Math.min(num1, num2), Math.max(num1, num2) % Math.min(num1, num2));
        }
    }
}
