import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class Lucy {
    private static final String FILE_NAME = "lucy.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        int cases = in.nextInt();
        for (int t = 0; t < cases; t++) {
            int lineNum = in.nextInt();
            in.nextLine();
            for (int l = 0; l < lineNum; l++) {
                char[] line = in.nextLine().toCharArray();
                //out.println(Arrays.toString(line));
                String lineEncoding = "";
                char previous = line[0];
                //out.print("prev " + previous);
                int count = 1;
                for (int c = 1; c < line.length; c++) {
                    if (previous == line[c]) {
                        count++;
                    } else {
                        lineEncoding += previous + "" + count;
                        count = 1;
                        previous = line[c];
                    }
                }
                lineEncoding += previous + "" + count;
                out.println(lineEncoding);
            }
            out.println("=====");
        }
    }
}
