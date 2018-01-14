import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class Chaoxiang {
    private static final String FILE_NAME = "chaoxiang.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));
        while (in.hasNext()) {
            double f = in.nextDouble();
            double k = (f - 32) / 1.8 + 273.16;
            out.printf("%.2f", k);
            out.println();
        }
    }
}
