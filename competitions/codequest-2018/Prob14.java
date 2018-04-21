import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob14 {
    private static final String FILE_NAME = "Prob14.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner c = new Scanner(new File(FILE_NAME));
        /*while (c.hasNext()) {

        }*/
        int cases = c.nextInt();
        for (int caseNum = 0; caseNum < cases; caseNum++) {
            int u = c.nextInt();
            String[] upper = new String[u];
            int[] upperL = new int[u];
            for (int i = 0; i < upper.length; i++) {
                upperL[i] = c.nextInt();
                upper[i] = "";
            }
            int l = c.nextInt(), ui = 0, li = 0;
            String[] lower = new String[l];
            int[] lowerL = new int[l];
            for(int i = 0; i < lower.length; i++) {
                lowerL[i] = c.nextInt();
                lower[i] = "";
            }
            String encoded = "";
            c.nextLine();
            while (c.hasNextLine()) {
                encoded += c.nextLine();
              //  System.out.println(encoded);
            }
           // System.out.println(encoded);
            for(int i = 0; i < encoded.length(); i++){

                if(encoded.charAt(i) >= 65 && encoded.charAt(i) < 91)
                    upper[ui] += encoded.charAt(i);
                else if(encoded.charAt(i) == '-')
                    upper[ui] += " ";
                else if(encoded.charAt(i) == '=')
                    lower[li] += " ";
                else
                    lower[li] += encoded.charAt(i);
                if(ui < upper.length && upper[ui].length() == upperL[ui])
                    ui++;
                if(li < lower.length && lower[li].length() == lowerL[li])
                    li++;
            }
            for (String s:upper) {
                System.out.println(s);
            }
            System.out.println();
            for (String s:lower) {
                System.out.println(s);
            }
        }
    }
}
