import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Egor {
    public static void main(String[] args) {
        try (Scanner f = new Scanner(new File("egor.dat"))) {
            int cases = f.nextInt();
            f.nextLine();
            ArrayList<String> names = new ArrayList<>();
            for (int i = 0; i < cases; i++) {
                String name = f.nextLine();
                if(name.length() >= 5 && name.length() <= 8 && !name.contains("ph") && !name.contains("Ph") && !name.contains("c")&& !name.contains("m") && !name.contains("o")&& !name.contains("y") && !name.contains("C")&& !name.contains("M") && !name.contains("O")&& !name.contains("Y") && name.substring(0, 1).matches("[A-M]"))
                    names.add(name);
            }
            Collections.sort(names);
            for (String name : names) {
                System.out.println(name);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
