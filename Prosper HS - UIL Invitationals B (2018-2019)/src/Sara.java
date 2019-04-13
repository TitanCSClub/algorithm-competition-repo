import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sara {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("sara.dat"))) {
            int cases = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] bridesRaw = scanner.nextLine().split(" ");
                String[] groomsRaw = scanner.nextLine().split(" ");

                Set<String> brides = new TreeSet<>(Arrays.asList(bridesRaw));
                Set<String> grooms = new TreeSet<>(Arrays.asList(groomsRaw));

                Set<String> total = new TreeSet<>(brides);
                total.addAll(grooms);

                Set<String> copy = new TreeSet<>(brides);
                copy.retainAll(grooms);

                brides.removeAll(copy);
                grooms.removeAll(copy);

                System.out.println("Guests: " + string(total));
                System.out.println("Guests of Both: " + string(copy));
                System.out.println("Bride's Guests: " + string(brides));
                System.out.println("Groom's Guests: " + string(grooms));
                for (int i1 = 0; i1 < 20; i1++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String string(Set<String> list) {
        StringBuilder output = new StringBuilder();
        for (String s : list) {
            output.append(s).append(" ");
        }
        if (output.toString().isEmpty()) {
            return "none";
        }
        return output.toString();
    }
}
