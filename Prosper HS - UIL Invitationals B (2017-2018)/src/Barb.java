import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Correct
 */
public class Barb {
    private static final String FILE_NAME = "barb.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        while (in.hasNext()) {
            String word = in.nextLine();
            out.print(word + " ");
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            out.print(sb.toString().toUpperCase() + " ");
            if (word.length() % 2 == 0) {
                sb = new StringBuilder(word.substring(0, word.length() / 2));
            } else {
                sb = new StringBuilder(word.substring(0, word.length() / 2 + 1));
            }
            out.print(sb.reverse().toString() + " ");
            out.print(word.substring(word.length() / 2).toUpperCase() + "\n");
        }
    }
}
