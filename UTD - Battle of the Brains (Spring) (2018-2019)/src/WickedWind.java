import java.util.Scanner;

public class WickedWind {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int cases = f.nextInt();
        f.nextLine();
        for (int caseNum = 0; caseNum < cases; caseNum++) {
            int leaves = f.nextInt();
            int leaf[] = new int[leaves];
            for (int i = 0; i < leaves; i++) {
                leaf[i] = f.nextInt();
            }
            int sum = 0;
            for (int i = 1; i < leaves - 1; i++) {
                sum += Math.pow(leaf[i] - leaf[i - 1], 2);
            }
            sum *= Math.pow(2, leaves) % (Math.pow(10, 9) + 7);
            System.out.println(sum);
        }
    }
}
