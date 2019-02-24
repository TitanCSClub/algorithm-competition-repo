import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class C {
    private static String FILE_NAME = "C.txt";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File(FILE_NAME))) {
            int runs =1;
            while (sc.hasNext()) {
                int dice1 = sc.nextInt();
                int dice2 = sc.nextInt();


                int[][] sums = new int[dice1][dice2];
                int high = 0;
                for (int i = 1; i <= dice1; i++) {
                    for (int j = 1; j <= dice2; j++) {
                        sums[i-1][j-1] = i + j;
                        if (high < sums[i-1][j-1]) {
                            high = sums[i-1][j-1];
                        }

                    }
                }
                int[] sums2 = new int[high+1];
                for (int i = 1; i <= dice1; i++) {
                    for (int j = 1; j <= dice2; j++) {
                        sums2[sums[i-1][j-1]]++;

                    }
                }
                int index=0;
                ArrayList<Integer>  last = new ArrayList<Integer>();
                for(int i=1;i<sums2.length;i++){
                    if(sums2[i]>sums2[index]){
                        last.clear();
                        index=i;
                        last.add(i);
                    } else if(sums2[i] == sums2[index]){
                        last.add(i);
                    }
                }
                last.sort(Collections.reverseOrder());
                System.out.println("Test Case " + runs +":");
                for(int i=last.size()-1;i>=0;i--){
                    System.out.println(last.get(i));
                }
                runs++;
            }//end of while loop
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}