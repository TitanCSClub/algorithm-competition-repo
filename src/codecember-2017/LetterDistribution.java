import java.util.*;

/**
 * State: complete
 */
public class LetterDistribution {
    private static HashMap<String, Integer> letters = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        for (int i = 0; i < 26; i++) {
            letters.put("" + (char) ('A' + i), 0);
        }
        for (String letter : input.split("")) {
            if (!letter.equals(" ") && Character.isLetter(letter.charAt(0))) {
                if (letters.containsKey(letter)) {
                    letters.put(letter, letters.get(letter) + 1);
                }
            }
        }
        List<Letter> letterList = new ArrayList<>();
        for (String string : letters.keySet()) {
            letterList.add(new Letter(string, letters.get(string)));
        }
        Collections.sort(letterList);
        letterList.forEach(System.out::println);
    }

    static class Letter implements Comparable<Letter> {

        String letter;
        int occurence;

        Letter(String letter, int occurence) {
            this.letter = letter;
            this.occurence = occurence;
        }

        @Override
        public String toString() {
            String stars = "";
            for (int i = 0; i < occurence; i++) {
                stars += "*";
            }
            return letter + " " + stars;
        }

        @Override
        public int compareTo(Letter o) {
            if (occurence < o.occurence) {
                return 1;
            } else if (occurence > o.occurence) {
                return -1;
            } else {
                if (letter.compareTo(o.letter) < 0) {
                    return -1;
                } else if (letter.compareTo(o.letter) > 0) {
                    return 1;
                }
            }
            return 0;
        }
    }
}
