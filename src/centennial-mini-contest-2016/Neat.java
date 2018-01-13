import java.util.Scanner;

/**
 * Template for inputting the system.
 */
public class Neat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        System.out.print((numberOne + numberTwo) / 2.0);
    }
}
