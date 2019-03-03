import java.util.Scanner;

/**
 * State: complete
 */
public class Pie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            System.out.println(input % 3);
        }
    }
}
