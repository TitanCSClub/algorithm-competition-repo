import java.io.*;
import static java.lang.System.*;
import java.util.*;

public class Johnny {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("johnny.dat"));
        HashMap<Character, ArrayList<String>> map = new HashMap<>();
        HashMap<String, Character> rmap = new HashMap<>();
        String line = "";
        boolean first = true;
        while (in.hasNext()) {
            line = in.nextLine();
            //out.println(line.substring(0,1).matches("//w"));
            if (line.charAt(1)==' ' && line.substring(0,1).matches("[^A-Za-z]")) {
                String[] words = line.substring(line.indexOf(" ")+1).split("/");
                //out.println("!!!" +Arrays.toString(words));
                map.put(line.charAt(0), new ArrayList<>());
                for (int i=0; i<words.length; i++) {
                    map.get(line.charAt(0)).add(words[i]);
                    rmap.put(words[i], line.charAt(0));
                }
                //out.println("added");

            } else {
                break;
            }
        }
        while (in.hasNext() ) {
            if (!first) {
                line = in.nextLine();
            } else {
                first = false;
            }
            String result = "";
            String[] words2 = line.split(" ");
            for (int i=0; i<words2.length; i++) {
                result += rmap.get(words2[i]);
            }
            out.println(result);

        }
    }
}
