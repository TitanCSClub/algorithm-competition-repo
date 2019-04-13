import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;
import java.util.*;
public class Prob12 {
    private static final String FILE_NAME = "Prob12.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        int cases = in.nextInt();
        in.nextLine();
        for (int ca = 0; ca < cases; ca++) {
          int limInd = in.nextInt() + 1;
          boolean[] dudes = new boolean[limInd];
          ArrayList<Integer> primesA = new ArrayList<Integer>();

          for (int i=2; i<dudes.length; i++) {
              if (dudes[i]==false) {
                  //prime
                  primesA.add(i);
                  int ind = i+i;
                  int elimCount = 0;
                  while (ind<dudes.length) {
                      if (dudes[ind]==false) {
                          dudes[ind] = true;
                          elimCount++;
                         // out.println(i + " elimed " + ind);
                      }
                      ind += i;
                  }
                  if (elimCount != 0) {
                      primesA.add(elimCount);

                  } else {
                      primesA.add(-10);
                  }


              }
          }


            for (int i=0; i<primesA.size(); i++) {
                if (i%2==0 && primesA.get(i+1)!=-10) {
                    out.println("Prime " + primesA.get(i) + " Composite Set Size: " + primesA.get(i+1));

                }
            }
            out.print("{");
            for (int i=0; i<primesA.size(); i++) {
                if (i%2==0) {
                    if (i==primesA.size()-2) {
                        out.print(primesA.get(i));
                    } else {
                        out.print(primesA.get(i) + ",");
                    }

                }
            }
            out.println("}");


        }
    }

}
