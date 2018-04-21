import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;

public class Prashant {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File("prashant.dat"));
        while (console.hasNext()){
            String nextLine = console.nextLine();
            String[] ugh = nextLine.split(" ");
            char[] chars = new char[ugh.length];
            for (int i = 0; i < ugh.length; i++){
                chars[i] = ugh[i].charAt(0);
            }
            ArrayList<Character> letters = new ArrayList<Character>();
            ArrayList<Integer> occurrences = new ArrayList<Integer>();
            for (int i = 0; i < chars.length; i++){
                int index = letters.indexOf(chars[i]);
                if (index == -1){
                    letters.add(chars[i]);
                    occurrences.add(1);
                }
                else{
                    occurrences.set(index,occurrences.get(index) + 1);
                }
            }
            int sum = 0;
            for (int i = 0; i < occurrences.size(); i++){
                sum += occurrences.get(i);
            }
            long tot = factorial(sum);
            for (int i = 0; i < occurrences.size(); i++){
                tot/=(factorial(occurrences.get(i)));
            }
            System.out.println(tot);
        }
    }
    public static long factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
