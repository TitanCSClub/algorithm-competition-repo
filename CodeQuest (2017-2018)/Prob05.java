import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob05 {
    private static final String FILE_NAME = "Prob05.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner c = new Scanner(new File(FILE_NAME));
        /*while (c.hasNext()) {

        }*/
        int cases = c.nextInt();
        for (int i = 0; i < cases; i++) {
            int num = c.nextInt(), count = 0, startNum = num;
            while(num != 1){
                if(num % 2 == 0){
                    num /= 2;
                }
                else
                    num = num * 3 + 1;
                count++;
            }
            System.out.println(startNum+":"+(count+1));
        }
    }
}
