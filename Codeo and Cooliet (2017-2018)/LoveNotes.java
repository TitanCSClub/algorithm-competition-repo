import java.util.Scanner;

public class LoveNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int shift = scanner.nextInt();
            String[] message = scanner.next().split("");
            StringBuilder output = new StringBuilder();
            for (String letter : message) {
                output.append(Letter.nextLetter(Letter.getLetter(letter), shift));
            }
            System.out.println(output.toString());
        }
    }

    enum Letter {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

        public static String nextLetter(Letter letter, int count) {
            Letter output = letter;
            for (int i = 0; i < count; i++) {
                if (output.equals(Letter.Z)) {
                    output = Letter.A;
                } else {
                    output = values()[output.ordinal() + 1];
                }
            }
            return output.toString();
        }

        public static Letter getLetter(String letter) {
            for (int i = 0; i < values().length; i++) {
                if (values()[i].toString().equals(letter)) {
                    return values()[i];
                }
            }
            return null;
        }

        public static Letter getLetter(int index) {
            return values()[index];
        }

        public String toString() {
            return super.toString().toLowerCase();
        }
    }
}
    