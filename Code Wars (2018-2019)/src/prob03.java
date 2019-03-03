import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("prob03.txt"));
        System.out.printf("%3.2f", (3.0/4) * Math.pow(scanner.nextInt(), 2) * Math.PI);
    }
}
