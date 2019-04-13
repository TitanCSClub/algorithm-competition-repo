import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sarah {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("sarah.dat"))) {
            while (scanner.hasNext()) {
                String original = scanner.next();
                String str = original;
                if (str.substring(0, 1).matches("[aeiou]")) {
                    str = String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(0)) + str.substring(2);
                }
                for (int i = 2; i < str.length() - 1; i++) {
                    if (str.substring(i, i + 1).matches("[aeiou]")) {
                        str = str.substring(0, i - 1) + String.valueOf(str.charAt(i + 1)) + String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i - 1));
                    }
                }
                if (str.substring(str.length() - 1).matches("[aeiou]")) {
                    str = String.valueOf(str.charAt(str.length() - 1)) + str.substring(1, str.length() - 1) + String.valueOf(str.charAt(0));
                }
                System.out.println(original + " " + str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
