import java.util.Scanner;

/**
 * State: complete
 */
public class FastFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        for (int i = 0; i < numCases; i++) {
            int nextNum = scanner.nextInt();
            System.out.print(fibonacci(nextNum));
            if (i != numCases - 1) {
                System.out.println();
            }
        }
    }

    public static long fibonacci(int n) {
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                numbers[i] = 1;
            } else if (i == 1) {
                numbers[i] = 1;
            } else {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
        }
        return numbers[n - 1];
    }
}
