import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.*;

public class Debra {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File("debra.dat"));
        while (console.hasNext()){
            int rows = console.nextInt();
            int cols = console.nextInt();
            console.nextLine();
            for (int i = 0; i < rows; i++){
                String nextLine = console.nextLine();
                StringBuilder builder = new StringBuilder(nextLine);
                builder.reverse();
                System.out.println(builder.toString());
            }
            System.out.println("=====");
        }
    }
}
