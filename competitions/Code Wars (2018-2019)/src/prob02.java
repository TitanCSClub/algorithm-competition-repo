import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob02 {
    public static void main(String[] args) throws IOException {
        Scanner f = new Scanner(new File("prob02.txt"));
        int h = f.nextInt(), m = f.nextInt(), s = f.nextInt();
        if(s * h >= m)
            System.out.printf("%d %d %d. I will make it!", h, m, s);
        else{
            System.out.printf("%d %d %d. I will be late!", h, m, s);
        }
    }
}
