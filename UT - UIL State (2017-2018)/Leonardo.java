import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leonardo {
    private static String FILE_NAME = "leonardo.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        while (scanner.hasNext()) {
            String[] cas = scanner.nextLine().split(" = ");
            String[] celName = cas[0].split(" ");
            String[] realName = cas[1].split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            for (String s : celName) {
                stringBuilder.append(s.charAt(0));
            }
            stringBuilder.append(" = ");
            for (String s : realName) {
                stringBuilder.append(String.valueOf(s.charAt(s.length() - 1)).toUpperCase());
            }
            System.out.println(stringBuilder);
        }
        /*int cases = scanner.nextInt();
        for (int counter = 0; counter < cases; counter++) {

        }*/
    }
}
