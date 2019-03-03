import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prob16 {
    public static void main(String[] args) throws IOException {
        Scanner f = new Scanner(new File("prob16.txt"));
        ArrayList<String> str = new ArrayList<String>(Arrays.asList(f.nextLine().split(" ")));
        for (int i = 0; i < str.size() - 1; i++) {
            if(!str.get(i).toLowerCase().equals("is") && !str.get(i).toLowerCase().equals("had") && str.get(i).toLowerCase().equals(str.get(i+1).toLowerCase())){
                str.remove(i+1);
                i--;
            }
        }
        String rtn = str.get(0);
        for (int i = 1; i < str.size(); i++) {
            rtn += " " + str.get(i);
        }
        System.out.println(rtn);
    }

}
