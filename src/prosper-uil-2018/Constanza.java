import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Constanza {
    private static final String FILE_NAME = "constanza.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));
        ArrayList<String> cNames = new ArrayList<>();
        cNames.add("red");
        cNames.add("orange");
        cNames.add("yellow");
        cNames.add("green");
        cNames.add("blue");
        cNames.add("indigo");
        cNames.add("violet");
        int[] counts = new int[7];
        while (in.hasNext()) {
            String color = in.nextLine();
            int ind = cNames.indexOf(color);
            counts[ind]++;
        }

        for (int z = 0; z < cNames.size(); z++) {
            String stars = "";
            for (int i = 0; i < counts[z]; i++) {
                stars += "*";
            }
            out.printf("%-7s", cNames.get(z));
            out.println(stars);
        }
    }
}
