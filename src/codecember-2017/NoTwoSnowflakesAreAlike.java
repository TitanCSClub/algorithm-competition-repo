import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * State: complete
 * Note: did not receive credit for this question due to competition having it wrong on their end.
 */
public class NoTwoSnowflakesAreAlike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else {
                inputs.add(input);
            }
        }
        inputs = giveRepeats(inputs);
        for (int i = 0; i < inputs.size(); i++) {
            if (i == inputs.size() - 1) {
                System.out.print(inputs.get(i));
            } else {
                System.out.println(inputs.get(i));
            }
        }
    }

    private static List<String> giveRepeats(List<String> longList) {
        List<String> repeats = new ArrayList<>();
        for (int i = longList.size() - 1; i >= 0; i++) {
            if (longList.indexOf(longList.get(i)) != i) {
                boolean toContinue = false;
                for (String repeat : repeats) {
                    if (repeat.contains(longList.get(i))) {
                        toContinue = true;
                    }
                }
                if (toContinue) {
                    continue;
                }
                repeats.add(longList.get(i));
            }
        }
        return repeats;
    }
}
