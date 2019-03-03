import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class prob24 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("prob24.txt"));
        String url = scanner.nextLine();
        String[] spl = url.split("/");
        int exc = 2;
        List<Integer> skips = new ArrayList<>();
        for (int i = 0; i < spl[exc].length(); i++) {
            char character = spl[exc].charAt(i);
            if (character == '.' || character == ':') {
                int len = url.substring(0, url.indexOf(spl[exc]) + 1).length() + i - 1;
                skips.add(len);
            }
        }
        for (int i = 0; i < url.length(); i++) {
            char character = url.charAt(i);
            if (!Character.isAlphabetic(character) && !Character.isDigit(character) && !skips.contains(i)) {
                String hex = Integer.toHexString((int) character).toLowerCase();
                System.out.print("0x25" + hex);
            } else {
                System.out.print(character);
            }
        }

    }
}
