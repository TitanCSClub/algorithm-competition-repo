import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Correct for 8 points
 */
public class prob12 {
    private static final String FILE_NAME = "prob12.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        int cases = in.nextInt();
        in.nextLine();
        ArrayList<String> prevOrig = new ArrayList<String>();
        String[] prev = new String[cases];
        //String[] prevOriG = new String[cases];
        for (int ca = 0; ca < cases; ca++) {
            prevOrig.add(in.nextLine());
            /*
            String line = in.nextLine();
            prevOrig[ca] = line;
            line = line.replaceAll(" ", "");
            prev[ca] = line;
            */

        }
        Collections.sort(prevOrig);
        for (int s = 0; s < prevOrig.size(); s++) {

            prev[s] = prevOrig.get(s).replaceAll(" ", "");
        }

        //for (String s: prev) {
        //   out.println(s);
        //}
        cases = in.nextInt();
        in.nextLine();
        for (int ca = 0; ca < cases; ca++) {
            String toCon = in.nextLine().replaceAll(" ", "");
            boolean take = false;
            for (int i = 0; i < prev.length; i++) {
                //out.println("trying " + prev[i] + " and " + toCon);
                if (ana(toCon, prev[i])) {
                    take = true;
                    out.println("Yes: " + prevOrig.get(i));
                    break;
                }
            }
            if (!take) {
                out.println("No: No matching case");
            }
        }
    }

    public static boolean ana(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        } else {
            for (int i = 0; i < one.length(); i++) {
                if (two.indexOf(one.charAt(i) + "") == -1) {
                    return false;
                } else {
                    two = two.substring(0, two.indexOf(one.charAt(i) + "")) + "." + two.substring(two.indexOf(one.charAt(i) + "") + 1);
                }
            }
            return true;
        }
    }
}
