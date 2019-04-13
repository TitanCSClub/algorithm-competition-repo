import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rajeev {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("rajeev.dat"))) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",");
                String file = line[0];
                String owner = line[1];
                StringBuilder output = new StringBuilder();
                for (int i = 2; i < line.length; i++) {
                    if (!line[i].contains("@uiltexas.org") && !line[i].contains("@uil.net")) {
                        output.append(line[i]).append(":");
                    }
                }
                if (!output.toString().isEmpty()) {
                    System.out.println(file + ":" + owner + ":" + output.toString().substring(0, output.toString().length() - 1));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
