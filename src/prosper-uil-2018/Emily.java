import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class Emily {
    private static final String FILE_NAME = "emily.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        while (in.hasNext()) {
            int b1 = in.nextInt();
            int b2 = in.nextInt();
            int h = in.nextInt();
            double avg = (b1 + b2) / 2.0;
            double ans = avg * h;
            if (ans % 1 == 0) {
                out.println((int) ans);
            } else {
                out.printf("%.1f\n", ans);
            }
        }
    }
}
