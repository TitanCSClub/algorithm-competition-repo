import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B {
    private static String FILE_NAME = "B.txt";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File(FILE_NAME))) {
            while (sc.hasNext()) {
                int cases = sc.nextInt();
                if (cases == 0) {
                    break;
                }
                sc.nextLine();
                ArrayList<Name> names = new ArrayList<>();
                for (int i = 0; i < cases; i++) {
                    names.add(new Name(sc.nextLine()));
                }
                Collections.sort(names);
                for (Name name : names) {
                    System.out.println(name.name);
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Name implements Comparable<Name> {
    public final String name;
    private final char firstChar;
    private final char secondChar;
    Name(String name) {
        this.name = name;
        firstChar = name.charAt(0);
        secondChar = name.charAt(1);
    }
    @Override
    public int compareTo(Name o) {
        if (firstChar > o.firstChar) {
            return 1;
        } else if (firstChar < o.firstChar) {
            return -1;
        } else {
            if (secondChar < o.secondChar) {
                return -1;
            }
            if (secondChar > o.secondChar) {
                return 1;
            }
        }
        return 0;
    }
}