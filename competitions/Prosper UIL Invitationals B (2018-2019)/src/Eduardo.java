import java.io.File;
import java.util.Scanner;

public class Eduardo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("eduardo.dat"))) {
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                int shift = text.split(" ")[0].length();
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                        int character = text.charAt(i);
                        int newChar = character + shift;
                        if (newChar > 122) {
                            newChar = 97 + (newChar - 123);
                        }
                        System.out.print((char) newChar);
                    } else {
                        System.out.print(text.charAt(i));
                    }
                }
                System.out.println();
            }
        }
        catch(Exception e){e.printStackTrace();}
    }
}
