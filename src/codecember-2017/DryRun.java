import java.util.Scanner;

/**
 * State: complete
 */
public class DryRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int percentage = scanner.nextInt();
        System.out.println("We are " + percentage + "% ready to compete!");
    }
}
