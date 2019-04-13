import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Team6 on 11/13/2017.
 */
public class Sharing {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("sharing.in"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextInt() % 3);
        }
    }
}
