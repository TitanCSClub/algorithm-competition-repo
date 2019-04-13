import java.io.File;
import java.util.Scanner;

public class Barb {
    public static void main(String[] args) {
        try (Scanner f = new Scanner(new File("barb.dat"))) {
            while (f.hasNext()) {
                System.out.println("A   A*A   3*A   A/2");
                int times = f.nextInt();
                for (int i = 1; i <= times; i++) {
                    System.out.println(i + "     " + i*i + "     "+3*i+"     "+i/2);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
