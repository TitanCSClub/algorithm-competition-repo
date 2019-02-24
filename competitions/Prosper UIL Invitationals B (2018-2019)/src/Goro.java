import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Goro {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(new File("goro.dat"))) {


                int num = sc.nextInt();
                ArrayList<Double> vals = new ArrayList<Double>();
                int a = 1;
                int e=0;
                double pie = Math.pow(12,(1.0/2));
                for(int b=0;b<num;b++,a+=2,e+=1){
                    vals.add((double)1.0/(a*Math.pow(3,e)));
                }
                for(int j=0;j<vals.size();j++){
                    double temp=0;
                    temp+=vals.get(0);
                    for(int b=0;b<=j;b++){
                      //  System.out.println(vals.get(j));
                        if(b%2==0)
                            temp+=vals.get(j);
                        else
                            temp-=vals.get(j);
                    }
                    System.out.println(pie*temp);
                    pie = Math.pow(12,(1.0/2));
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
