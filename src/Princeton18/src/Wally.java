import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Wally {
    private static final String FILE_NAME = "wally.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));
        boolean getR = true;
        List<String> reserved = new ArrayList<String>();
        List<String> name = new ArrayList<String>();
        while (in.hasNext()) {
            if (getR) {
                String rmaybe = in.nextLine();
                if (rmaybe.equals("999")) {
                    getR = false;
                } else {
                    reserved.add(rmaybe);
                }
            } else {
                String maybe = in.nextLine();
                boolean good = true;
                //out.println(maybe + " -- ");
                if (!maybe.matches("[A-Za-z0-9_$]+")) {
                    good = false;
                    //out.println("1");
                }
                if ((maybe.charAt(0) + "").matches("[0-9]")) {
                    good = false;
                    //out.println("2");
                }
                if (reserved.contains(maybe)) {
                    good = false;
                    //out.println("3");
                }
                if (good) {
                    name.add(maybe);
                    //out.println("added");
                }
            }
        }
        Collections.sort(name);
        //out.println("======================");
        for (String x : name) {
            out.println(x);
        }
    }
}
