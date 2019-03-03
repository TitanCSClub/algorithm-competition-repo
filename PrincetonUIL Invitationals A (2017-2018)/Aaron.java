package Princeton18;

import java.io.FileNotFoundException;

import static java.lang.System.out;

public class Aaron {
    private static final String FILE_NAME = "";

    public static void main(String[] args) throws FileNotFoundException {
        // Scanner scanner = new Scanner(new File(FILE_NAME));


        for (int i = 0; i < 21; i++) {
            out.print("`");
        }
        out.println();
        for (int i = 0; i < 20; i++) {
            out.print("_");
        }
        out.println();
        for (int i = 0; i < 19; i++) {
            out.print("^");
        }
        out.println();
        for (int i = 0; i < 18; i++) {
            out.print("]");
        }
        out.println();
        for (int i = 0; i < 17; i++) {
            out.print("\\");
        }
        out.println();
        for (int i = 0; i < 16; i++) {
            out.print("[");
        }

    }
}
