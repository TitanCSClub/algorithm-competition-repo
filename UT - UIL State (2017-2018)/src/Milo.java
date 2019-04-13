import java.io.*;
import java.util.*;

public class Milo {
    private static String FILE_NAME = "milo.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File(FILE_NAME));
        while (console.hasNext()) {
            HashMap<Character, Integer> romanDict = new HashMap<Character, Integer>();
            romanDict.put('I', 1);
            romanDict.put('V', 5);
            romanDict.put('X', 10);
            romanDict.put('L', 50);
            romanDict.put('C', 100);
            romanDict.put('D', 500);
            romanDict.put('M', 1000);
            char[] numeral = console.nextLine().toCharArray();
            int value = 0;
            if (numeral.length == 1){
                System.out.println(romanDict.get(numeral[0]));
            }
            else{
            for (int i = 0; i < numeral.length; i++){
                try {
                    if (romanDict.get(numeral[i]) < romanDict.get(numeral[i + 1])) {
                        value += romanDict.get(numeral[i + 1]);
                        value -= romanDict.get(numeral[i]);
                        i++;
                    }
                    else{
                        value += romanDict.get(numeral[i]);
                    }
                }
                catch(Exception e){
                    value += romanDict.get(numeral[i]);
                }

            }
            System.out.println(value);
        }}

    }
}
