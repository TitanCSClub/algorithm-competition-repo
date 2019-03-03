import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Correct for 5 points
 */
public class prob07 {
    private static final String FILE_NAME = "prob07.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File(FILE_NAME));
        while (console.hasNext()) {
            int nums = console.nextInt();
            if (nums == 0) {
                break;
            }
            ArrayList<Integer> set1 = new ArrayList<Integer>();
            ArrayList<Integer> set2 = new ArrayList<Integer>();
            for (int i = 0; i < nums; i++) {
                int nextInt = console.nextInt();
                set1.add(nextInt);
                set2.add(nextInt);
            }
            int max1 = Collections.max(set1);
            set1.remove(set1.indexOf(max1));
            int max2 = Collections.max(set1);
            set1.remove(set1.indexOf(max2));
            int max3 = Collections.max(set1);
            set1.remove(set1.indexOf(max3));
            int maxProd1 = max1 * max2 * max3;

            int max1a = Collections.max(set2);
            set2.remove(set2.indexOf(max1a));
            int min2 = Collections.min(set2);
            set2.remove(set2.indexOf(min2));
            int min3 = Collections.min(set2);
            set2.remove(set2.indexOf(min3));
            int maxProd2 = max1a * min2 * min3;

            int max = Math.max(maxProd1, maxProd2);
            out.println(max);

        }
    }
}
