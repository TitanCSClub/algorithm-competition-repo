import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class William {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("william.dat"));

        while (in.hasNext()) {
            String data = in.nextLine();
            String one = data.substring(0, data.length()/2);
            String two = new StringBuilder(data.substring(data.length()/2)).reverse().toString();
            int[][] dp = new int[one.length()+1][two.length()+1];
            for (int r=0; r<one.length(); r++) {
                dp[r][0]=0;
                dp[0][r]=0;
            }
            for (int r=1; r<one.length()+1; r++) {
                for (int c=1; c<two.length()+1; c++) {
                    if (one.charAt(r-1)==two.charAt(c-1)) {
                        dp[r][c] = dp[r-1][c-1] +1;
                    } else {
                        dp[r][c] = Math.max(dp[r-1][c], dp[r][c-1]);
                    }
                }
            }
            //out.println(dp[one.length()][two.length()]);
            if (dp[one.length()][two.length()]==0) {
                out.println(":");
            } else {
                int currR = one.length();
                int currC = two.length();
                String result = "";
                while (true) {
                    //out.println(currR + " " + currC);
                    if (dp[currR][currC] == 0) {
                        break;
                    }

                    int up = dp[currR - 1][currC];
                    int left = dp[currR][currC - 1];
                    if (up > left) {
                        currR--;
                    } else if (left > up) {
                        currC--;
                    } else {
                        if (dp[currR][currC] - 1 == dp[currR - 1][currC - 1]) {
                            result = one.charAt(currR - 1) + result;
                            currR--;
                            currC--;
                        } else {
                            currC--;
                        }
                    }

                }
                out.println(result+":"+new StringBuilder(result).reverse().toString());

            }

        }
    }
}
