import java.io.File;
import java.util.Scanner;

public class prob04 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("prob04.txt"))) {
            int cases = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < cases; i++) {
                double tax = scanner.nextDouble() / 100;
                double amount = scanner.nextDouble();

                double pretaxPrice = amount / (1.0 + tax);
                double taxAmount = pretaxPrice * tax;
                System.out.printf("On your $%5.2f purchase, the tax amount was $%.2f\n", amount, taxAmount);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
