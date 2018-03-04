import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * State: complete
 */
public class TheBiggest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            integerList.add(scanner.nextInt());
            if (i != cases - 1) {
                scanner.nextLine();
            }
        }
        if (!integerList.isEmpty()) {
            System.out.println(Collections.max(integerList));
        }
    }
}
