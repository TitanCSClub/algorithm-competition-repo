import javax.sound.sampled.Line;
import java.awt.geom.Line2D;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class prob07 {
    public static void main(String[] args) throws IOException {
        Scanner f = new Scanner(new File("prob07.txt"));
        int i = f.nextInt(), m = f.nextInt();
        while(i != 0 || m != 0){
            switch (m){
                case 0:
                    if(i % 2 == 0){
                        System.out.println(i + 2);
                    }
                    else{
                        System.out.println(i + 1);
                    }
                    break;
                case 1:
                    BigInteger big = new BigInteger("" + (i + 1));
                    while(!big.isProbablePrime(1)){
                        big.add(new BigInteger("1"));
                    }
                    System.out.println(big);
                    break;
                case 2:
                    System.out.println(Math.pow(Math.floor(Math.sqrt(i + 1)), 2));
                    break;
                case 3:
                    System.out.println(Math.pow(Math.floor(Math.cbrt(i + 1)), 3));
                    break;
            }
            i = f.nextInt(); m = f.nextInt();
        }

    }
}
