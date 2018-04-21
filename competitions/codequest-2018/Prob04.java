import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob04 {
    private static final String FILE_NAME = "Prob04.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner c = new Scanner(new File(FILE_NAME));
        int cases = c.nextInt();
        c.nextLine();
        for (int i = 0; i < cases; i++) {
            boolean r = false, p = false, s = false;
            String line = c.nextLine();
            for(int x = 0; x < line.length(); x++){
                if(line.charAt(x) == 'R')
                    r = true;
                else if(line.charAt(x) == 'P')
                    p = true;
                else if(line.charAt(x) == 'S')
                    s = true;
            }
            if(r&&p&&s)
                System.out.println("NO WINNER");
            else if(r && p) {
                System.out.println("PAPER");
            } else if (r && s) {
                System.out.println("ROCK");
            } else if (p && s) {
                System.out.println("SCISSORS");
            }
            else{
                System.out.println("NO WINNER");
            }
        }
    }
}
