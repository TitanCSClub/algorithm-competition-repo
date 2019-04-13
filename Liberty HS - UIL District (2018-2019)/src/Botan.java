import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Botan {
    public static void main(String[] args) {
        try (Scanner  sc= new Scanner(new File("botan.dat"))) {
            int cases = sc.nextInt();
            for (int i=1;i<=cases;i++) {
                String x = sc.next();

                if(Integer.parseInt(x)<10){

                    if(isPrime(Integer.parseInt(x))){
                        System.out.println("Case #"+i+": BOTAN-PRIME");
                    } else {
                        System.out.println("Case #"+i+": NOT BOTAN-PRIME");
                    }
                } else {
                    if(isBotanPrime(x)){
                        System.out.println("Case #"+i+": BOTAN-PRIME");
                    } else {
                        System.out.println("Case #"+i+": NOT BOTAN-PRIME");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static boolean isPrime(int a){
       // System.out.println(a);
        if(a==2 || a==3 || a==5 || a==7){
            return true;
        }
        return false;
    }
    public static boolean isBotanPrime(String a){
       // System.out.println(a+"fgy");
        for(int i=0;i<a.length();i++){
            if(!isPrime(Integer.parseInt(Character.toString(a.charAt(i))))){
                return false;
            }
        }
        return true;
    }
}
