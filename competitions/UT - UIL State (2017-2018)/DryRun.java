import java.io.*;
import static java.lang.System.*;
import java.util.*;

public class DryRun {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("dryrun.dat"));
        int num = in.nextInt();
        in.nextLine();
        for (int c=0; c<num; c++) {
            out.println("I like " + in.nextLine() + ".");
        }
    }
}
