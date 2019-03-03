import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ankur {
    private static String FILE_NAME = "ankur.dat";

    public static void main(String[] args) throws FileNotFoundException {
        String[] stuff = {"3141.59", "3141.592654", "3.141593e+03", "271.828",
                        "271.828183", "2.718282e+02"};
        for (String s : stuff) {
            System.out.println(s);
        }
        /*Scanner in = new Scanner(new File(FILE_NAME));
        *//*while (in.hasNext()) {

        }*/
        /*int cases = in.nextInt();
        for (int counter = 0; counter < cases; counter++) {

        }*/
    }
}
