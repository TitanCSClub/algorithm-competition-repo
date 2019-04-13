import java.io.*;
import java.util.*;

public class AppealingNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aL = sc.nextInt();
        int friends = sc.nextInt();

        int[] AnNum = new int[aL];
        for(int i=0;i<aL;i++){
            AnNum[i] = sc.nextInt();

        }

        for(int i=0;i<friends;i++){
            int friend = sc.nextInt();
            int biggest =0;
            for(int j=0;j<AnNum.length;j++){
                if((AnNum[j] ^ friend) > (biggest ^ friend)){
                    biggest = AnNum[j];
                }
            }
            System.out.println(biggest);
        }
    }
}