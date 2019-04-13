import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Team6 on 11/13/2017.
 */
public class Thankful {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("thankful.in"));
        int number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.println("We're thankful for " + scanner.nextLine() + ".");
        }
    }
}
