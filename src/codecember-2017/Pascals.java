import java.util.Scanner;

/**
 * State: incomplete
 * Note: Could have solved issues by using BigInteger.
 */
public class Pascals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int numRows = scanner.nextInt();
            printPascal(numRows);
        }
    }

    public static void printPascal(int numRows) {
        for (int i = 0; i < numRows; i++) {
            String spaces = "";
            for (int q = 0; q < numRows - i - 1; q++) {
                spaces += " ";
            }
            System.out.print(spaces);
            for (int j = 0; j < i + 1; j++) {
                if (j == i) {
                    System.out.print(nChooseK(i, j));
                } else {
                    System.out.print(nChooseK(i, j) + " ");
                }

            }
            System.out.println("");
        }
    }

    public static long nChooseK(int n, int k) {
        if (n < k) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }
        if (k == 0) {
            return 1;
        }

        return (nFactorial(n) / (nFactorial(n - k) * nFactorial(k)));
    }

    public static long nFactorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

}
