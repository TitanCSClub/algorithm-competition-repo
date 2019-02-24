import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class F {
    private static String FILE_NAME = "F.txt";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File(FILE_NAME))) {
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                StringBuilder dataB = new StringBuilder(sc.nextLine());
                boolean toCont = true;
                while (toCont) {
                    int thisMoves = 0;
                    for (int i1 = 0; i1 < dataB.length() - 2; i1++) {
                        if (isViableMove(dataB.substring(i1, i1 + 3))) {
                            char firstThing = dataB.charAt(i1);
                            char thirdThing = dataB.charAt(i1 + 2);
                            dataB.setCharAt(i1, thirdThing);
                            dataB.setCharAt(i1 + 2, firstThing);
                            dataB.deleteCharAt(i1 + 1);
                            i1++;
                            thisMoves++;
                            System.out.println(dataB);
                        }
                    }
                    for (int i1 = dataB.length(); i1 >= 3; i1--) {
                        if (isReverseViable(dataB.substring(i1 - 3, i1))) {
                            char firstThing = dataB.charAt(i1 - 1);
                            char thirdThing = dataB.charAt(i1 - 3);
                            dataB.setCharAt(i1 - 1, thirdThing);
                            dataB.setCharAt(i1 - 3, firstThing);
                            dataB.deleteCharAt(i1 - 2);
                            i1--;
                            thisMoves++;
                            System.out.println(dataB);
                        }
                    }
                    if (thisMoves == 0) {
                        toCont = false;
                    }
                }//while
                System.out.println(dataB);
                int pebbles = 0;
                for (int i1 = 0; i1 < dataB.length(); i1++) {
                    if (dataB.charAt(i1) == 'o') {
                        pebbles++;
                    }
                }
                System.out.println(pebbles);
            }//cases
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static boolean isViableMove(String test) {
        return test.equals("-oo");
    }

    private static boolean isReverseViable(String test) {
        return test.equals("oo-");
    }
}
