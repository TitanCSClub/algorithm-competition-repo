import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Correct for 5 points
 */
public class prob06 {
    private static final String FILE_NAME = "prob06.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        /*while (in.hasNext()) {

        }*/
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            String phoneNumberRaw = scanner.nextLine();
            String original = phoneNumberRaw;
            if (!Character.isDigit(phoneNumberRaw.charAt(0))) {
                phoneNumberRaw = phoneNumberRaw.substring(1);
            }
            String phoneNumber = phoneNumberRaw;
            String areaCode = phoneNumber.substring(0, 3);
            phoneNumber = phoneNumber.substring(3);
            if (areaCode.substring(0, 1).matches("[01]") || areaCode.substring(1, 2).equals("9")) {

                System.out.println(original + " INVALID");
                continue;
            }
            while (!Character.isDigit(phoneNumber.charAt(0))) {
                phoneNumber = phoneNumber.substring(1);
            }
            String exchangeCode = phoneNumber.substring(0, 3);
            phoneNumber = phoneNumber.substring(3);
            if (exchangeCode.substring(0, 1).matches("[01]") || exchangeCode.substring(1, 3).equals("11")) {
                System.out.println(original + " INVALID");
                continue;
            }
            System.out.println(original + " VALID");
        }
    }
}
