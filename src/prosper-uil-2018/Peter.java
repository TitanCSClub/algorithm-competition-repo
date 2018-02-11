import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Incorrect
 */
public class Peter {
    private static final String FILE_NAME = "peter.dat";

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File(FILE_NAME));
        while (in.hasNext()) {
            int value = in.nextInt();
            in.nextLine(); // look
            ArrayList<Integer> denoms = new ArrayList<Integer>();
            Scanner te = new Scanner(in.nextLine());
            while (te.hasNext()) {
                denoms.add(te.nextInt());
            }
            Collections.sort(denoms);
            int max = Collections.max(denoms);
            int realMax = Math.max(max, value);
            ArrayList<ArrayList<Integer>> sortedCoins = new ArrayList<>(realMax + 1);
            sortedCoins.set(0, new ArrayList<Integer>());
            ArrayList<Integer> bestVals = new ArrayList<>(realMax + 1);
            bestVals.set(0, Integer.MAX_VALUE);
            for (int i = 1; i < denoms.get(0); i++) {
                sortedCoins.set(i, new ArrayList<>());
                bestVals.set(i, Integer.MAX_VALUE);
            }
            for (int v = 0; v < denoms.size(); v++) {
                bestVals.set(denoms.get(v), 1);
            }
            for (int b = 1; b <= value; b++) {
                if (denoms.indexOf(b) != -1) {
                    ArrayList<Integer> possDenoms = new ArrayList<>();
                    for (Integer x : denoms) {
                        if (x < b) {
                            possDenoms.add(x);
                        } else {
                            break;
                        }
                    }
                    int least = Integer.MAX_VALUE;
                    for (int p = 0; p < possDenoms.size(); p++) {
                        if (1 + bestVals.get(b - possDenoms.get(p)) < least) {
                            least = 1 + bestVals.get(b - possDenoms.get(p));


                        }
                    }
                    int p = possDenoms.get(least);
                    ArrayList<Integer> newCoins = sortedCoins.get(b);
                    newCoins.add(p);
                    sortedCoins.set(b, newCoins);
                    Collections.sort(sortedCoins.get(b));
                }
            }
            System.out.println(value + " " + bestVals.get(value) + " " + sortedCoins.get(value).toString());
        }
        /*int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {

        }*/
    }
}
