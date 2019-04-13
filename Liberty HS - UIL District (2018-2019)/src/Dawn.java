import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dawn {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("dawn.dat"))) {
            int cases = scanner.nextInt();
            scanner.nextLine();

            print(" ", 5);
            System.out.print("Amount");
            print(" ", 30);
            System.out.print("Monthly");
            print(" ", 9);
            System.out.print("Total of");
            System.out.println();
            print(" ", 4);
            System.out.print("Invested");
            print(" ", 8);
            System.out.print("APR");
            print(" ", 6);
            System.out.print("Years");
            print(" ", 6);
            System.out.print("Payment");
            print(" ", 9);
            System.out.print("Payments");
            print(" ", 12);
            System.out.print("Profit");
            System.out.println();
            print(".", 84);
            System.out.println();

            double totalA = 0, totalP = 0, totals = 0, profits = 0;

            for (int i = 0; i < cases; i++) {
                double a = scanner.nextDouble();
                double apr = scanner.nextDouble();
                int years = scanner.nextInt();
                double r = (apr / 100) / 12;
                double n = years * 12;
                double p = (a * r)/(1 - Math.pow(1 + r, -n));
                double total = a + (p * n);
                double profit = total - a;
                System.out.print("$  ");
                System.out.printf("%,6.2f", a);
                System.out.print("  |  ");
                System.out.printf("%6.3f", apr);
                System.out.print("%  |  ");
                System.out.printf("%3s", years);
                System.out.print("  |  $");
                System.out.printf("%,10.2f", p);
                System.out.print("  |  $");
                System.out.printf("%,12.2f", total);
                System.out.print("  |  $");
                System.out.printf("%,12.2f", profit);
                System.out.println();
                totalA += a;
                totalP += p;
                totals += total;
                profits += profit;
            }

            System.out.print("$  ");
            System.out.printf("%,6.2f", totalA);
            System.out.print("  |  ");
            print(" ", 7);
            System.out.print("  |  ");
            print(" ", 3);
            System.out.print("  |  $");
            System.out.printf("%,10.2f", totalP);
            System.out.print("  |  $");
            System.out.printf("%,12.2f", totals);
            System.out.print("  |  $");
            System.out.printf("%,12.2f", profits);
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void print(String message, int count) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < count; i++) {
            output.append(message);
        }
        System.out.print(output.toString());
    }
}
