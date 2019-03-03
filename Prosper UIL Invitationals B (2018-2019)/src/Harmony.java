import java.io.File;
import java.util.Scanner;

public class Harmony {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("harmony.dat"))) {
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] acc = sc.nextLine().split("");
                String asd = "";
                for(int b  = 0;b<acc.length;b++){
                    asd += acc[b];
                }
                int even = 0;
                int odd=0;
                int high =0;
                for(int j=0;j<acc.length-1;j++){
                    if((j+1)%2==0){

                        even+= Integer.parseInt(acc[j]);
                    } else {


                        odd+= Integer.parseInt(acc[j]);
                        if(Integer.parseInt(acc[j])>Integer.parseInt(acc[acc.length-1])){
                            high++;
                        }
                    }
                }
                System.out.println(acc[acc.length-1]);
                int check = even + (odd*3) + high;

                String dd =check+"";
                int x = Integer.parseInt(dd.substring(dd.length()-1));

                if(10-x == Integer.parseInt(acc[acc.length-1])){
                    System.out.println(asd + " VALID");
                } else {
                    System.out.println(check+" "+x);
                    System.out.println(asd+" INVALID " +(10-x));
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
