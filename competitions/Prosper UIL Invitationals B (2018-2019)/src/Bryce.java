import java.io.File;
import java.util.Scanner;

public class Bryce {
    public static void main(String[] args) {
        try (Scanner f = new Scanner(new File("bryce.dat"))) {
            while (f.hasNext()) {
                int num = f.nextInt();
                String str = num+":";
                char[] rome = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
                int[] val = {1000, 500, 100, 50, 10, 5, 1};
                for (int i = 0; i < rome.length; i++) {
                    while (num - val[i] >= 0){
                        num -= val[i];
                        str+= rome[i];
                    }
                }
                str = str.replaceAll("DCCCC", "CM");
                str = str.replaceAll("LXXXX", "XC");
                str = str.replaceAll("VIIII", "IX");
                str = str.replaceAll("IIII", "IV");
                System.out.println(str);
            }
        }
        catch (Exception e){e.printStackTrace();}
    }
}
