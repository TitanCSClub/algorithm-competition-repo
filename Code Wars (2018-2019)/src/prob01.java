import java.io.File;
import java.util.Scanner;

public class prob01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("prob01.txt"))) {
            String word = scanner.next();
            System.out.println("While we seem to disagree on this issue, " + word + ", I respect your opinion and " +
                    "look forward to further discussion!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
