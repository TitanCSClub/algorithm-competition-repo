import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class prob05 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("prob05.txt"));

            int N = sc.nextInt();
            System.out.println(recur(N));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static int recur(int a){
        if(a==1)
            return 1;
        return (int)Math.pow(a,2) + recur(a-1);

    }
}
