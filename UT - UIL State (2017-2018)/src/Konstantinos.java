import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Konstantinos {
    private static String FILE_NAME = "konstantinos.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File(FILE_NAME));
        while (console.hasNext()) {
            int x1 = console.nextInt();
            int y1 = console.nextInt();
            int r1Old = console.nextInt();
            int x2 = console.nextInt();
            int y2 = console.nextInt();
            int r2Old = console.nextInt();
            int r1 = Math.min(r1Old, r2Old);
            int r2 = Math.max(r1Old, r2Old);
            console.nextLine();
            double d = distance(x1, y1, x2, y2);
            if (d > r1 + r2){
                System.out.println("NON-INTERSECTING");
            }
            else if (d == r1 + r2){
                System.out.println("EXTERNALLY TANGENT");
            }
            else if (d + r1 == r2){
                System.out.println("INTERNALLY TANGENT");
            }
            else if (d + r1 < r2){
                System.out.println("NESTED");
            }
            else{
                System.out.println("INTERSECTING");
            }
        }

    }
    public static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
}
