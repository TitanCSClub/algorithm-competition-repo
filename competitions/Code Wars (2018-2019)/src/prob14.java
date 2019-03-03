import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob14 {
    public static void main(String[] args) throws IOException {
        Scanner f = new Scanner(new File("prob14.txt"));
        int f0 = f.nextInt(), f1 = f.nextInt(), f2 = f0 + f1, n = f.nextInt();
        System.out.print(f0 + "," + f1);
        for (int i = 2; i < n; i++) {
            System.out.print("," + f2);
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }
    }
}
