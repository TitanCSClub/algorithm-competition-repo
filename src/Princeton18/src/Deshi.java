import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Deshi {
    private static final String FILE_NAME = "deshi.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        while (scanner.hasNextLine()) {
            String message = scanner.nextLine();
            int counter = 0;
            boolean consonant = false;
            boolean success = true;
            for (int i = 0; i < message.length(); i++) {
                if ((consonant && counter >= 7) || (!consonant && counter >= 4)) {
                    success = false;
                    System.out.println("NOT ACCEPTABLE " + message);
                    break;
                }
                if ((message.charAt(i) + "").matches("[aeiou]") && consonant) {
                    consonant = false;
                    counter = 0;
                } else if (!(message.charAt(i) + "").matches("[aeiou]") && !consonant) {
                    consonant = true;
                    counter = 0;
                }
                counter++;
            }
            if (success) {
                System.out.println("ACCEPTABLE " + message);
            }
        }
    }
}
