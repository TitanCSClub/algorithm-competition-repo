import java.util.Set;
import java.util.TreeSet;

public class Alfonso {
    public static void main(String[] args) {
        String[] a = new String[7];
        a[0]  = "ACEGIKMOQSUWY";
        a[1] = "EGIKMOQSUWY";
        a[2] = "IKMOQSUWY";
        a[3]= "MOQSUWY";
        a[4] = "QSUWY";
        a[5]="UWY";
        a[6] = "Y";


        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length();j++){
                String t = a[i].substring(j);
                for(int k = 0 ;k<t.length();k++){
                    System.out.print(t.charAt(k));
                }
                System.out.println();
            }
        }
    }
}
