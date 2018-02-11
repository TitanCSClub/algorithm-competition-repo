import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Correct
 */
public class Judith {
    private static final String FILE_NAME = "judith.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        ArrayList<Number> numbers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            numbers.add(new Number(scanner.nextLine()));
        }
        Collections.sort(numbers);
        for (Number number : numbers) {
            System.out.println(number.number);
        }
    }

    static class Number implements Comparable<Number> {

        String number;
        String first;
        String dec;

        Number(String number) {
            this.number = number;
            this.first = number.substring(0, number.indexOf("."));
            this.dec = number.substring(number.indexOf(".") + 1);
        }

        @Override
        public int compareTo(Number o) {
            if (first.length() > o.first.length()) {
                return 1;
            } else if (first.length() < o.first.length()) {
                return -1;
            } else {
                if (first.compareTo(o.first) != 0) {
                    return first.compareTo(o.first);
                } else {
                    return dec.compareTo(o.dec);
                }
            }
        }
    }
}
