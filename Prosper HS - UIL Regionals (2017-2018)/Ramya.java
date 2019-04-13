import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Ramya {
    public static ArrayList<String> gens;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("ramya.dat"));

        while (in.hasNext()) {
            char[] data = in.nextLine().toCharArray();
            ArrayList<Character> usable = new ArrayList<>();
            for (int c=0; c<data.length; c++) {
                usable.add(data[c]);
            }
            int needed = data.length;
            gens = new ArrayList<String>();
            generate(usable, "", needed);

            HashSet<String> printed = new HashSet<>();
            for (String g: gens) {
                if (printed.contains(g)) {

                } else {
                    printed.add(g);
                    out.println(g);
                }
            }
            out.println("=====");
        }
    }

    public static ArrayList<Character> dupe (ArrayList<Character> orig) {
        ArrayList<Character> newOne = new ArrayList<>();
        for (Character b: orig) {
            newOne.add(b);
        }
        return newOne;
    }

    public static void generate (ArrayList<Character> usable, String curr, int needed) {
        //out.println("u " + curr);
        if (curr.length()==needed) {
            gens.add(curr);

        } else {
            for (int i=0; i<usable.size(); i++) {
                ArrayList<Character> newUsable = dupe(usable);
                newUsable.remove(i);
                generate(newUsable, curr+usable.get(i), needed);
            }
        }
    }
}
