import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hyun {
    public static void main(String[] args) {
        try (Scanner f = new Scanner(new File("hyun.dat"))) {
            int cases = f.nextInt();
            f.nextLine();
            Character[] numarr = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'}, toparr = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'}, homearr = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'}, bottomarr = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
            ArrayList<Character> num = new ArrayList<Character>(Arrays.asList(numarr));
            ArrayList<Character> top = new ArrayList<Character>(Arrays.asList(toparr));
            ArrayList<Character> home = new ArrayList<Character>(Arrays.asList(homearr));
            ArrayList<Character> bottom = new ArrayList<Character>(Arrays.asList(bottomarr));
            for (int i = 0; i < cases; i++) {
                boolean numB = false, topB = false, homeB = false, bottomB = false;
                String str = f.nextLine();
                for (int x = 0; x < str.length(); x++) {
                    if(num.contains(str.charAt(x))){
                        numB = true;
                    } else if(top.contains(str.charAt(x))){
                        topB = true;
                    } else if(home.contains(str.charAt(x))){
                        homeB = true;
                    } else if(bottom.contains(str.charAt(x))){
                        bottomB = true;
                    }
                }
                System.out.println("Case #" + (i + 1) + ": " + (numB ? "NUMBER ":"") + (topB ? "TOP ":"") + (homeB ? "HOME ":"") + (bottomB ? "BOTTOM ":""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
