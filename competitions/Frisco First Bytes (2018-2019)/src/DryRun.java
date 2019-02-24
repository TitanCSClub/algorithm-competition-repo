import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DryRun {
    private static String FILE_NAME = "dry.txt";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine() + "! We are ready to begin!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
