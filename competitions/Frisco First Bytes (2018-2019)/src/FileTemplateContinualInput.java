import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTemplateContinualInput {
    private static String FILE_NAME = "NAME.txt";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File(FILE_NAME))) {
            while (sc.hasNext()) {

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}