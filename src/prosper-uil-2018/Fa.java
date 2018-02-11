import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class Fa {
    private static final String FILE_NAME = "fa.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        while (in.hasNext()) {
            int itemNum = in.nextInt();
            int[] items = new int[itemNum];
            for (int i = 0; i < itemNum; i++) {
                items[i] = in.nextInt();
            }
            //out.println(Arrays.toString(items));
            int bestError = Integer.MAX_VALUE;
            int bestS = -1;
            int bestSL = -1;
            int bestSR = -1;
            for (int s = 1; s < items.length * 2; s++) {
                int sumLeft = 0;
                int sumRight = 0;
                if (s % 2 == 1) { //odd between
                    sumLeft = 0;
                    for (int l = 0; l < s / 2 + 1; l++) {
                        sumLeft += items[l];
                    }
                    sumRight = 0;
                    for (int r = s / 2 + 1; r < items.length; r++) {
                        sumRight += items[r];
                    }
                } else {
                    sumLeft = 0;
                    for (int l = 0; l < s / 2; l++) {
                        sumLeft += items[l];
                    }
                    sumRight = 0;
                    for (int r = s / 2 + 1; r < items.length; r++) {
                        sumRight += items[r];
                    }
                }
                int error = Math.abs(sumLeft - sumRight);
                if (error < bestError) {
                    bestError = error;
                    bestS = s;
                    bestSL = sumLeft;
                    bestSR = sumRight;
                }

            }
            //out.println(bestS);
            String descrip = "";
            if (bestS % 2 == 0) {
                descrip = "^" + (bestS / 2);
            } else {
                descrip = (bestS / 2) + "^" + (bestS / 2 + 1);
            }
            out.println(bestSL + " " + descrip + " " + bestSR);


        }
    }
}
