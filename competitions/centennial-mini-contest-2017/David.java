import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Team6 on 11/13/2017.
 */
public class David {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("david.in"));
        int number = scanner.nextInt();
        scanner.nextLine();
        String[] fileNames = new String[number];
        for (int i = 0; i < number; i++) {
            String file = scanner.nextLine();
            fileNames[i] = file;
        }

        boolean noChange = false;

        while (!noChange) {
            noChange = true;
            for (int i = 0; i < fileNames.length - 1; i++) {
                String line1 = fileNames[i];
                String line2 = fileNames[i + 1];
                if (swap(line1, line2)) {
                    noChange = false;
                    fileNames[i] = line2;
                    fileNames[i + 1] = line1;
                }
            }
        }

        for (int i = 0; i < fileNames.length; i++) {
            System.out.println(fileNames[i]);
        }
    }

    private static boolean swap(String string1, String string2) {
        String fileName1 = string1.toLowerCase().substring(0, string1.indexOf(".")).replace(".", "").replaceFirst("the", "");
        String fileName2 = string2.toLowerCase().substring(0, string2.indexOf(".")).replace(".", "").replaceFirst("the", "");
        String fileExtension1 = string1.toLowerCase().substring(string1.indexOf(".") + 1);
        String fileExtension2 = string2.toLowerCase().substring(string2.indexOf(".") + 1);
        boolean doSwap = false;
        if (fileExtension1.equals(fileExtension2)) {
            if (fileName1 != null && !Objects.equals(fileName1, "") && fileName2 != null && !Objects.equals(fileName2, "")) {
                char[] fLetters = fileName1.toCharArray();
                char[] sLetters = fileName2.toCharArray();
                for (int i = 0; i < fLetters.length; i++) {
                    if (Letter.getValue(fLetters[i]) < Letter.getValue(sLetters[i])) {
                        doSwap = true;
                    }
                    if (Letter.getValue(fLetters[i]) != Letter.getValue(sLetters[i])) {
                        break;
                    }
                }
            }
        } else {
            char[] fLetters = fileExtension1.toLowerCase().toCharArray();
            char[] sLetters = fileExtension2.toLowerCase().toCharArray();
            for (int i = 0; i < fLetters.length; i++) {
                if (Letter.getValue(fLetters[i]) > Letter.getValue(sLetters[i])) {
                    doSwap = true;
                }
                if (Letter.getValue(fLetters[i]) != Letter.getValue(sLetters[i])) {
                    break;
                }
            }
        }
        return doSwap;
    }

    private enum Letter {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

        public static int getValue(char aLetter) {
            for (Letter letter : values()) {
                if (letter.toString().toLowerCase().equals(String.valueOf(aLetter))) {
                    return letter.ordinal();
                }
            }
            return -1;
        }
    }
}
