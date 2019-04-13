import java.util.Scanner;

public class Kepler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double p = scanner.nextDouble();
            if (p == 0) {
                break;
            }
            double au = Math.cbrt(Math.pow(p, 2));
            System.out.printf("%.2f\n", au);
        }
    }
}
    