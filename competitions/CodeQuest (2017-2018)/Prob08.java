import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob08 {
    private static final String FILE_NAME = "Prob08.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        /*while (scanner.hasNext()) {

        }*/
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            String[] rawNums = scanner.nextLine().split(" ");
            double[] nums = new double[rawNums.length];
            for (int i1 = 0; i1 < rawNums.length; i1++) {
                nums[i1] = Double.parseDouble(rawNums[i1]);
            }
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (nums[i1] > 180) {
                    System.out.printf("%06.2f", nums[i1] - 180);
                } else {
                    System.out.printf("%06.2f", 360 - (180 - nums[i1]));
                }
                if (i1 != nums.length-1) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
