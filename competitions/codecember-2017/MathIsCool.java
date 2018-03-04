import java.util.Scanner;

/**
 * State: incomplete
 */
public class MathIsCool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        for (int i = 0; i < numCases; i++) {
            int number = scanner.nextInt();
            System.out.println(reduce(number));

        }
    }

    public static int reduce(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n % 3 == 0) {
            return 1 + reduce(n / 3);
        }
        /*if (n % 3 == 1)
        {
            return 1 + reduce(n-1);
        }
        */
        if (n % 2 == 0) {
            return 1 + reduce(n / 2);
        }
        return 1 + reduce(n - 1);
    }
}
