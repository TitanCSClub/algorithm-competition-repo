import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob00 {
    private static final String FILE_NAME = "Prob00.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        /*while (in.hasNext()) {

        }*/
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            int cases2 = scanner.nextInt();
            scanner.nextLine();
            for (int i1 = 0; i1 < cases2; i1++) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
