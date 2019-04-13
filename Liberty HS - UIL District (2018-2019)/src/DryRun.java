import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DryRun {

    public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(new File("dryrun.dat"))) {
	        int cases = scanner.nextInt();
	        scanner.nextLine();
            for (int i = 0; i < cases; i++) {
                System.out.println("I like " + scanner.nextLine() + ".");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
