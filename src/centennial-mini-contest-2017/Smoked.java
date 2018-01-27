import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Team6 on 11/13/2017.
 */
public class Smoked {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("smoked.in"));
        int inputs = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < inputs; i++) {
            String[] line = scanner.nextLine().split(" ");
            int firstNumber = Integer.parseInt(line[0]);
            int secondNumber = Integer.parseInt(line[1]);

            int counter = firstNumber;
            int aNum = firstNumber / secondNumber;
            while (aNum > 0) {
                counter += aNum;
                aNum /= secondNumber;
            }
            System.out.println(counter);
        }
    }


}
