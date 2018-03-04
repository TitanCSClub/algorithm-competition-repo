import java.util.Scanner;

/**
 * Template for inputting the system.
 */
public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double baseNumber = scanner.nextInt();
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt() / baseNumber);
        }
    }
}
