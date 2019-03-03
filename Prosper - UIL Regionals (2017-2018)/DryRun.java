import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DryRun {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("dryrun.dat"));
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            System.out.println("I like " + scanner.nextLine() + ".");
        }
        Integer.parseInt("2", 1);
    }
}
