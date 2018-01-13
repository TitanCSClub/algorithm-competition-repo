import java.util.Scanner;

/**
 * Template for inputting the system.
 */
public class Summer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numbers; i++) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            }
        }
        System.out.println(sum);
    }
}