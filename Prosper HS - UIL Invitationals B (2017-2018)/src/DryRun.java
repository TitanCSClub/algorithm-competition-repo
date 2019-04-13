import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Correct
 */
public class DryRun {
    private static final String FILE_NAME = "dryrun.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        /*while (scanner.hasNext()) {

        }*/
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            System.out.println("I like " + scanner.nextLine() + ".");
        }
    }
}
