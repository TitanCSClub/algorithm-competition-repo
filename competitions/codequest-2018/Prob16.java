import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;
import java.util.*;
public class Prob16 {
    private static final String FILE_NAME = "Prob16.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        int cases = in.nextInt();
        in.nextLine();
        for (int ca = 0; ca < cases; ca++) {
           int xc = in.nextInt();
           int yc = in.nextInt();
           int p = in.nextInt();
           int r1 = in.nextInt();
           int r2 = in.nextInt();
           double angleInc = Math.PI*2/p;
           double a = Math.PI/2;
           double a2 = Math.PI/2 + angleInc/2;

           for (int i=0; i<p*2; i++) {
               double x =0;
               double y =0;
               if (i%2==0) {
                   x = r1*Math.cos(a) + xc;
                   y = r1*Math.sin(a) + yc;
                   a += angleInc;
                   //out.println("OUT");
               } else {
                   x = r2*Math.cos(a2) + xc;
                   y = r2*Math.sin(a2) + yc;
                   a2 += angleInc;
                   //out.println("IN");
               }
               if (x==-0.0) {
                   x=0;
               }
               if (y==-0.0) {
                   y=0;
               }
               String brokenOutputBuffer1 = String.format("%.2f", x);
               if (brokenOutputBuffer1.equals("-0.00")) {
                   brokenOutputBuffer1 = "0.00";
               }
               String brokenOutputBuffer2 = String.format("%.2f", y);
               if (brokenOutputBuffer2.equals("-0.00")) {
                   brokenOutputBuffer2 = "0.00";
               }
              // out.printf("%.2f,%.2f", x,y);
               out.print(brokenOutputBuffer1 + "," + brokenOutputBuffer2);
               if (i!=p*2-1) {
                   out.print(" ");
               }
           }
           out.println();


        }
    }

}
