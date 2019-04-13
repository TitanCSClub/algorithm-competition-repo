import java.io.File;
import java.util.Scanner;

public class Nisha {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("nisha.dat"))) {
            int cases = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < cases; i++) {
                int num = scanner.nextInt();
                long one = (long) (Math.pow(2, num) / 2);
                long two = Integer.toBinaryString((int) Math.pow(2, num)).length() - 1;

                System.out.println("Case #" + (i + 1) + ": " + (one * two + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
