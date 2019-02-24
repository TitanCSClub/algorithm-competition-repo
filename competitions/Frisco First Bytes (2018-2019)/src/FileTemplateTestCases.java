import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTemplateTestCases {
    private static String FILE_NAME = "NAME.txt";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File(FILE_NAME))) {
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
