import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Polina {
    private static final String FILE_NAME = "polina.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(" ");
            String message = line[0];
            int[] codes = new int[line.length - 1];
            for (int i = 0; i < codes.length; i++) {
                codes[i] = Integer.parseInt(line[i + 1]);
            }

            for (int code : codes) {
                String[] hex = Integer.toHexString(code).split(""); //(Integer.parseInt(code + "", 16) + "").split("");
                System.out.println(Arrays.toString(hex));
                String[] codess = (code + "").split("");
                int[] nums = new int[(code + "").length()];
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = Integer.parseInt(codess[i]);
                }
                if (nums[0] % 2 == 0) {
                    // message
                    String temp = message.charAt(nums[1]) + "";
                    message = message.substring(0, nums[1]) + message.charAt(nums[2]) + temp + message.substring(nums[1] + 1);
                } else {
                    String temp = message.charAt(message.length() - nums[1]) + "";
                    message = message.substring(message.length(), message.length() - nums[1]) + message.charAt(message.length() - nums[2]) + temp + message.substring(message.length() - nums[1] + 1);
                }

                message = "A" + message + "AA";
                message = hex[0] + "" + message + "" + hex[2];
            }
            System.out.println(message);
        }
    }
}
