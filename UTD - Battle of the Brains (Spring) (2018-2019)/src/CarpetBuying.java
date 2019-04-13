import java.util.Scanner;

public class CarpetBuying {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int cases = f.nextInt();
        f.nextLine();
        for (int caseNum = 0; caseNum < cases; caseNum++) {
            int w = f.nextInt(), d = f.nextInt();
            System.out.println((int)Math.pow(Math.ceil(Math.sqrt(w * d)), 2));
        }
    }
}
