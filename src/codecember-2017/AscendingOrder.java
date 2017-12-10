import java.util.Scanner;

/**
 * State: not complete
 */
public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCases = scanner.nextInt();
        long[] array = new long[numberOfCases];
        for (int i = 0; i < numberOfCases; i++) {
            array[i] = scanner.nextLong();
        }
        findBest(array);
    }

    private static void findBest(long[] array) {
        long longBest = array[0];
    }
}
