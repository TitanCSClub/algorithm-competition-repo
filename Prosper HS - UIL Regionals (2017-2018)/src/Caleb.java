import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;

public class Caleb {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File("caleb.dat"));
        int cases = console.nextInt();
        console.nextLine();
        for (int i = 0; i < cases; i++){
            String nextLine[] = console.nextLine().split("/");
            int hours = Integer.parseInt(nextLine[0])/30;
            int minutes = Integer.parseInt(nextLine[1])/6;
            if (hours == 0){
                hours = 12;
            }
            System.out.print(hours + ":");
            System.out.printf("%02d", minutes);
            System.out.println();
        }
    }
}
