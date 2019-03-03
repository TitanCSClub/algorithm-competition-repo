import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dennis {
    private static String FILE_NAME = "dennis.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File(FILE_NAME));

        int cases = console.nextInt();
        for (int counter = 0; counter < cases; counter++) {
            int numWords = console.nextInt();
            console.nextLine();
            String[] words = new String[numWords];
            int maxL = 0;
            for (int i = 0; i < numWords; i++){
                words[i] = console.nextLine();
                if (words[i].length() > maxL){
                    maxL = words[i].length();
                }
            }
            for (int i = 0; i < words.length; i++) {
                String a = words[i];
                String newStr = a;
                if (a.length() < maxL) {
                    for (int j = 0; j < maxL - a.length(); j++) {
                        newStr += '@';
                    }
                }
                words[i] = newStr;
            }
            char[][] charsIce = new char[maxL][numWords];
            for (int col = 0; col < numWords; col++){
                for (int row = 0; row < maxL; row++){
                    charsIce[row][col] = words[col].charAt(row);
                }
            }
            for (int i = 0; i < charsIce.length; i++){
                for (int j = 0; j < charsIce[0].length; j++){
                    if (charsIce[i][j] != '@'){
                        System.out.print(charsIce[i][j]);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < numWords; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
