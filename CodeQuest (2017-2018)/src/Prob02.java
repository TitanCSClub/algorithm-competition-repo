import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob02 {
    private static final String FILE_NAME = "Prob02.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner c = new Scanner(new File(FILE_NAME));
        int cases = c.nextInt();
        c.nextLine();
        for (int i = 0; i < cases; i++) {
            int v = 0;
            String line = c.nextLine();
            for(int x =0; x < line.length(); x++){
                if(line.substring(x, x+1).matches("[aeiou]")){
                    v++;
                }
            }
            System.out.println(v);
        }
    }
}
