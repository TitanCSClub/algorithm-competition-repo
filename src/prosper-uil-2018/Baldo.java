import java.io.FileNotFoundException;

public class Baldo {
    private static final String FILE_NAME = "baldo.dat";

    public static void main(String[] args) throws FileNotFoundException {
        int number = 65;
        for (int i = number; i < 91; i++) {
            System.out.println((char) i + " " + i + " " + (char) (i + 32) + " " + (i + 32));
        }
    }
}
