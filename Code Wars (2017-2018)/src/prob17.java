import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Correct for 11 points
 */
public class prob17 {
    private static final String FILE_NAME = "prob17.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));
        ArrayList<String> warehouse = new ArrayList<String>();
        ArrayList<ArrayList<String>> stacks = new ArrayList<ArrayList<String>>();
        stacks.add(new ArrayList<String>());
        stacks.add(new ArrayList<String>());
        stacks.add(new ArrayList<String>());
        int numVacts = 0;
        while (in.hasNext()) {
            String comm = in.next();
            if (!comm.equals("DONE")) {
                switch (comm) {
                    case "RECV":
                        warehouse.add(in.nextLine().trim());
                        break;
                    case "LOAD":
                        String toLoad = warehouse.remove(0);
                        String toWhich = in.next();
                        stacks.get(late(toWhich)).add(0, toLoad);
                        break;
                    case "XFER":
                        String from = in.next();
                        String to = in.next();
                        String removed = stacks.get(late(from)).remove(0);
                        stacks.get(late(to)).add(0, removed);
                        break;
                    case "SEND":
                        //output
                        numVacts++;
                        String whichOne = in.next();
                        out.println("VACTRAIN " + numVacts);
                        ArrayList<String> sent = stacks.get(late(whichOne));
                        stacks.set(late(whichOne), new ArrayList<String>());
                        for (String s : sent) {
                            out.println(s);
                        }

                        break;
                }
            }
        }
    }

    public static int late(String lett) {
        if (lett.equals("A")) {
            return 0;
        } else if (lett.equals("B")) {
            return 1;
        } else if (lett.equals("C")) {
            return 2;
        }
        return -1;
    }
}
