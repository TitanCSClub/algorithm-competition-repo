import java.util.Scanner;

/**
 * State: complete
 */
public class HighArcticCamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            } else {
                String[] words = input.split(" ");
                StringBuilder output = new StringBuilder();
                output.append(words[0].toUpperCase());
                for (int i = 1; i < words.length; i++) {
                    output.append(words[i].toLowerCase().toUpperCase().replaceFirst(words[i].substring(0, 1).toUpperCase(), words[i].substring(0, 1).toLowerCase()));
                }
                System.out.println(output.toString());
            }
        }
    }
}
