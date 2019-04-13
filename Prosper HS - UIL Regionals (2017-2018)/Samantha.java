import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Samantha {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("samantha.dat"));
        while (scanner.hasNextLine()) {
            Scanner nums = new Scanner(scanner.nextLine());
            double subtotal = 0;
            while (nums.hasNextDouble()) {
                subtotal += nums.nextDouble();
            }
            double tax = subtotal * 0.0825;
            double total = subtotal + tax;
            System.out.printf("%11s", "Subtotal: $");
            System.out.printf("%7.2f", subtotal);
            System.out.println();
            System.out.printf("%11s", "Tax     : $");
            System.out.printf("%7.2f", tax);
            System.out.println();
            System.out.printf("%11s", "Total   : $");
            System.out.printf("%7.2f", total);
            System.out.println();
            System.out.println("=====");
        }
    }
}

