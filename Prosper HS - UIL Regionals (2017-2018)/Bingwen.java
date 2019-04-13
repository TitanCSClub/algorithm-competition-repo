import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Bingwen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("bingwen.dat"));
        while (scanner.hasNext()){
            System.out.printf("%.2f",Math.cbrt(scanner.nextInt()));
            System.out.println();
        }
    }
}
