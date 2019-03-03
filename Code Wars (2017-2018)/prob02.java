import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Correct for 3 points
 */
public class prob02 {
    private static final String FILE_NAME = "prob02.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));
        while (in.hasNext()) {
            double vel = in.nextDouble();
            double acc = in.nextDouble();
            double time = in.nextDouble();
            if (vel == 0 && acc == 0 && time == 0) {

            } else {
                double dist = vel * time + .5 * acc * time * time;
                out.printf("%.3f\n", dist);
            }
        }

    }
}
