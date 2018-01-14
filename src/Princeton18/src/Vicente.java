import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class Vicente {
    private static final String FILE_NAME = "vicente.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));
        while (in.hasNext()) {
            String bin = in.next();
            String dest = in.next();
            int count = 0;
            for (int i = 0; i < bin.length(); i++) {
                if (bin.charAt(i) == '1') {
                    count++;
                }
            }
            boolean even = false;
            if (count % 2 == 0) {
                even = true;
            }
            String newOne = "";
            if (even && dest.equals("EVEN")) {
                newOne = bin + "0";
            } else if (even && dest.equals("ODD")) {
                newOne = bin + "1";
            } else if (!even && dest.equals("EVEN")) {
                newOne = bin + "1";
            } else if (!even && dest.equals("ODD")) {
                newOne = bin + "0";
            }
            long norm1 = Long.parseLong(bin, 2);
            long norm2 = Long.parseLong(newOne, 2);

            out.println(Long.toString(norm1, 16).toUpperCase() + " " + Long.toString(norm2, 16).toUpperCase());

        }
    }
}
