import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob10 {
    private static final String FILE_NAME = "Prob10.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner c = new Scanner(new File(FILE_NAME));
        /*while (c.hasNext()) {

        }*/
        int cases = c.nextInt();
        c.nextLine();
        for (int i = 0; i < cases; i++) {
            String[] temp = c.nextLine().split(",");
            int row = Integer.parseInt(temp[0]), col = Integer.parseInt(temp[1]);
            temp = c.nextLine().split(",");
            int sRow = Integer.parseInt(temp[0]), sCol = Integer.parseInt(temp[1]);
            temp = c.nextLine().split(",");
            int eRow = Integer.parseInt(temp[0]), eCol = Integer.parseInt(temp[1]);
            if((sRow + sCol) % 2 == (eRow + eCol) % 2)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
