import java.io.*;
import static java.lang.System.*;
import java.util.*;

public class Emma {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("emma.dat"));
        while (in.hasNext()) {
            int x = in.nextInt();

            String[][] bob = new String [x*3][x*3];
            for (int r=0; r<x; r++) {
                for (int c=0; c<x; c++) {
                    bob[r][c]="*";
                }
            }

            for (int r=2*x; r<3*x; r++) {
                for (int c=0; c<x; c++) {
                    bob[r][c]="*";
                }
            }

            for (int r=2*x; r<3*x; r++) {
                for (int c=0; c<x; c++) {
                    bob[c][r]="*";
                }
            }

            for (int r=2*x; r<3*x; r++) {
                for (int c=2*x; c<3*x; c++) {
                    bob[r][c]="*";
                }
            }

            for (int r=x; r<2*x; r++) {
                for (int c=x; c<2*x; c++) {
                    if (r==c) {
                        bob[r][c]="*";
                    }

                }
            }

            for (int r=x; r<2*x; r++) {
                for (int c=2*x-1; c>=x; c--) {
                    if (r==bob.length-1-c) {
                        bob[r][c]="*";
                    }

                }
            }

            for (int r=0; r<bob.length; r++) {
                for (int c=0; c<bob[0].length; c++) {

                    if (bob[r][c]!=null) {
                        out.print(bob[r][c]);
                    } else {
                        out.print(" " );
                    }

                }
                out.println();
            }
            out.println("==========");

        }
    }
}
