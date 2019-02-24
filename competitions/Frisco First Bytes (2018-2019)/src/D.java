import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D {
    private static String FILE_NAME = "D.txt";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File(FILE_NAME))) {
            while( sc.hasNext()) {
                String data = sc.nextLine();
                String[] datasplit = data.split(" ");
                long[] intArray = new long[datasplit.length];
                for (int i = 0; i <datasplit.length ; i++) {
                    intArray[i] = Long.valueOf(datasplit[i]);
                }

                ArrayList<Long> factors = new ArrayList<Long>();

                for (int i = 0; i < intArray.length; i++) {
                    boolean keepGoing = true;
                    int lastIndex = 0;
                    long currNum = intArray[i];

                    while (keepGoing) {
                        long currFactor = getLF(currNum);
                        int indexExists = factors.indexOf(currFactor);

                        if (currFactor == currNum) {
                            keepGoing = false;
                            factors.add(currFactor);
                        } else {
                            if (indexExists == -1) {
                                factors.add(currFactor);
                            } else {
                                if (indexExists <= lastIndex) {
                                    factors.add(currFactor);
                                }
                                lastIndex = indexExists;
                            }

                            currNum /= currFactor;
                        }
                    }
                }

                Collections.sort(factors);

                long answer = 1;
                for (int i = 0; i < factors.size(); i++) {
                    //System.out.println(factors.get(i));
                    answer *= factors.get(i);
                }

                System.out.println(answer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static long getLF(long input) {
        if (input == 1 || input == 2) {
            return input;
        }
        for (long i = 2; i < input + 1; i++) {
            if (input % i == 0) {
                return i;
            }
        }
        return -1;
    }
}
