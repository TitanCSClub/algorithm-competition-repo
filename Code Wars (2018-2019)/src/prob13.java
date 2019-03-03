import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob13 {
    public static void main(String[] args) throws IOException {
        int x = -1;
        double[] nums = new double[4];
        Scanner f = new Scanner(new File("prob13.txt"));
        for (int i = 0; i < 4; i++) {
            try{
                nums[i] = f.nextInt();
            }
            catch (Exception e){
                x = i;
                f.nextLine();
            }
        }
        switch (x){
            case 0:
                System.out.printf("%.1f\n",nums[1] * (nums[2] / nums[3]));
                break;
            case 1:
                System.out.printf("%.1f\n",nums[0] / (nums[2]/nums[3]));
                break;
            case 2:
                System.out.printf("%.1f\n",nums[3] * (nums[0] / nums[1]));
                break;
            case 3:
                System.out.printf("%.1f\n",nums[2] / (nums[0]/nums[1]));
                break;
        }
    }
}
