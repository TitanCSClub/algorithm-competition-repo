import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob03 {
    private static final String FILE_NAME = "Prob03.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner c = new Scanner(new File(FILE_NAME));
        int cases = c.nextInt();
        c.nextLine();
        for (int i = 0; i < cases; i++) {
            int num = Integer.parseInt(c.nextLine().replace("th", ""));
            if(num < 20 && num > 9){
                System.out.println(num + "th");
            }
            else{
                switch(num%10){
                    case 1:
                        System.out.println(num + "st");
                        break;
                    case 2:
                        System.out.println(num + "nd");
                        break;
                    case 3:
                        System.out.println(num + "rd");
                        break;
                        default:
                            System.out.println(num + "th");
                }
            }
        }
    }
}
