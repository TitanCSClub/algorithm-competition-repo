import java.util.Scanner;

/**
 * State: complete
 */
public class AutomaticBallMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (!(x == 0 && y == 0)) {
                System.out.printf("%.2f", Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
                System.out.println();
            }
        }
    }
}
