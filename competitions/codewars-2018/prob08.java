import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Correct for 5 points
 */
public class prob08 {
    private static final String FILE_NAME = "prob08.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File(FILE_NAME));
        while (console.hasNext()) {
            int start = console.nextInt();
            int len = console.nextInt();
            if (start == 0 && len == 0) {
                break;
            }
            out.println(start + " " + len + " " + serialize(start, len));
        }

    }

    public static int serialize(int start, int len) {
        String res = "";
        if (("" + start).length() > len) {
            return 0;
        }
        for (int i = start; i < start + len; i++) {
            if ((res + "" + i).length() <= len) {
                res += "" + i;
            } else {
                return i - 1;
            }
        }
        return start + len - 1;
    }
}
