import java.util.Scanner;

public class Oddthello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            int cases2 = scanner.nextInt();
            int sum = 0;
            for (int j = 0; j < cases2; j++) {
                int number = scanner.nextInt();
                if (number % 2 == 0) {
                    sum -= number;
                } else {
                    sum += number;
                }
            }
            if (sum < 0) {
                System.out.println("UNFAITHFUL");
            } else {
                System.out.println("FAITHFUL");
            }
        }
    }
}
    