import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Joe {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("joe.dat"));
        while(in.hasNext()) {
            String data = in.nextLine();
            data = data.replaceAll("[.,?!\"]", "");
            String[] words = data.split(" ");
            for (int i =0; i<words.length; i++) {
                words[i] = words[i].toUpperCase();
            }
            HashSet<String> set = new HashSet<>();
            for (int i =0; i<words.length; i++) {
                set.add(words[i]);
            }
            int ind = 0;
            ArrayList<String> ww = new ArrayList<String>();
            for (String s: set) {
                ww.add(s);
            }
            Collections.sort(ww, new MeinKompf());
            for (String s: ww) {
                out.print(s + " ");
            }
            out.println();

        }


    }

    static class MeinKompf implements Comparator<String> {

        @Override
        public int compare(String a, String b) {
            if (a.length()>b.length()) {
                return 1;
            } else if (b.length()>a.length()) {
                return -1;
            } else {
                return a.compareTo(b);
            }
        }
    }
}
