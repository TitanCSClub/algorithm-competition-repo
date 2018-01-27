import java.util.Scanner;

public class OrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            String line = scanner.nextLine();
            System.out.println("To " + line + " or not to " + line + ".");
        }
    }
}
    