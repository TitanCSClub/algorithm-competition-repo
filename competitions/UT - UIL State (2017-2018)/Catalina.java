import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Catalina {
    private static String FILE_NAME = "catalina.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File(FILE_NAME));
        while (console.hasNext()) {
            char[] nextLine = console.nextLine().toCharArray();
            for (int i = 0; i < nextLine.length; i++){
                if (Character.isUpperCase(nextLine[i])){
                    System.out.print(nextLine[i]);
                }
            }
            System.out.println();
        }

    }
}
