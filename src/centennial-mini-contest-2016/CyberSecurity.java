import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            String check = scanner.nextLine();
            String scan = scanner.nextLine();
            int numberContains = scan.split(check).length - 1;

            if (scan.startsWith(check)) numberContains++;
            if (numberContains % 2 == 0) System.out.println("SAFE");
            else System.out.println("DANGEROUS");
        }
    }
}
    