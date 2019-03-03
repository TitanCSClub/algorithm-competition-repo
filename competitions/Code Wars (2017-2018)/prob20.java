import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Correct for 14 points
 */
public class prob20 {
    private static final String FILE_NAME = "prob20.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File(FILE_NAME));
        while (console.hasNext()) {
            int rings = console.nextInt();
            if (rings == 0) {
                break;
            }
            ArrayList<Integer> times = new ArrayList<Integer>();
            for (int i = 0; i < rings; i++) {
                times.add(console.nextInt());
            }
            int secs = seconds(rings, times);
            if (secs == -1) {
                out.println("They go forever!");
            } else {
                out.println(secs);
            }
        }
    }

    public static int seconds(int rings, ArrayList<Integer> times) {
        ArrayList<Integer> timeMods = new ArrayList<Integer>();
        int sumSoFar = 0;
        int prod = 1;
        for (int i = 0; i < rings; i++) {
            sumSoFar += times.get(i);
            prod *= times.get(i);
            timeMods.add(sumSoFar % times.get(i));
        }
        for (int i = sumSoFar; i < sumSoFar + prod; i++) {
            boolean works = true;
            for (int j = 0; j < times.size(); j++) {
                if (i % times.get(j) != timeMods.get(j)) {
                    works = false;
                    break;
                }

            }
            if (works) {
                return i;
            }

        }
        return -1;
    }
}
