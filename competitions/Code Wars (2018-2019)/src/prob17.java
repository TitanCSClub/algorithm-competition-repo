import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class prob17 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("prob17.txt"));
        String line = scanner.nextLine();
        HashMap<Character, Integer> freqs = new HashMap<>();
        TreeMap<Character, Integer> less10 = new TreeMap<>(Comparator.reverseOrder());
        TreeMap<Character, Integer> greatEqual10 = new TreeMap<>();
        for (int i = 0; i < line.length(); i++) {
            char character = line.charAt(i);
            if (character == ' ') {
                freqs.put(' ', freqs.getOrDefault(' ', 0) + 1);
            } else {
                freqs.put(character, freqs.getOrDefault(character, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> freq : freqs.entrySet()) {
            if (freq.getValue() < 10) {
                less10.put(freq.getKey(), freq.getValue());
            } else {
                greatEqual10.put(freq.getKey(), freq.getValue());
            }
        }
        for (Map.Entry<Character, Integer> val : less10.entrySet()) {
            if (val.getKey() == ' ') {
                System.out.print("_[" + val.getValue() + "]");
            } else {
                System.out.print(val.getKey() + "[" + val.getValue() + "]");
            }
        }
        System.out.print(";");
        for (Map.Entry<Character, Integer> val : greatEqual10.entrySet()) {
            if (val.getKey() == ' ') {
                System.out.print("_[" + val.getValue() + "]");
            } else {
                System.out.print(val.getKey() + "[" + val.getValue() + "]");
            }
        }
    }
}
