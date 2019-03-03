import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob06 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("prob06.txt"));
        int num = scanner.nextInt();
        System.out.println((num * 2) * (num - 1));
    }
}
