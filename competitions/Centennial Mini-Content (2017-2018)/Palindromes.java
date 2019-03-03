import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Team6 on 11/13/2017.
 */
public class Palindromes {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("palin.in"));
        while (scanner.hasNextLine()) {
            String currLine = scanner.nextLine().toLowerCase().replace(" ", "");
            StringBuilder newLine = new StringBuilder();
            String[] array = currLine.split("");
            for (int i = array.length - 1; i > 0; i--) {
                newLine.append(array[i]);
            }
            System.out.println((newLine.toString().equals(currLine)) ? "yes" : "no");
        }
    }
}
