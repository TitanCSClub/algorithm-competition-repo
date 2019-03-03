import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;
import java.util.*;
public class Prob11 {
    private static final String FILE_NAME = "Prob11.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        int cases = in.nextInt();
        in.nextLine();
        for (int ca = 0; ca < cases; ca++) {
           int[] key = new int[3];
           for (int i=0; i<3; i++) {
               key[i] = in.nextInt();
           }
           int tolerance = in.nextInt();
           int[] fore = new int[3];
           for (int i=0; i<fore.length; i++) {
               fore[i] = in.nextInt();
           }
           int[] back = new int[3];
           for (int i=0; i<3; i++) {
               back[i] = in.nextInt();
           }
           double dist = Math.sqrt(Math.pow(key[0]-fore[0],2) + Math.pow(key[1]-fore[1],2) + Math.pow(key[2]-fore[2],2));
           int[] ans = new int[3];
           if (dist<=tolerance) {
               ans = back;
           } else {
               ans = fore;
           }

           for (int i=0; i<ans.length; i++) {
               if (i==ans.length-1) {
                   out.print(ans[i]);
               } else {
                   out.print(ans[i] + " ");
               }

           }
           out.println();


        }
    }

}
