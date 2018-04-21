import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob01 {
    private static final String FILE_NAME = "Prob01.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner f = new Scanner(new File(FILE_NAME));
        int cases = f.nextInt();
        for (int i = 0; i < cases; i++) {
            if(f.nextInt() < 70)
                System.out.println("FAIL");
            else
                System.out.println("PASS");
        }
    }
}
