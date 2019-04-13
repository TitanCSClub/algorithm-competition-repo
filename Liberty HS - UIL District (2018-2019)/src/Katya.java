import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Katya {
    public static void main(String[] args) {
        try (Scanner f = new Scanner(new File("katya.dat"))) {
            int cases = f.nextInt();
            f.nextLine();
            for (int i = 1; i <= cases; i++) {
                System.out.print(i + ":");
                int r1 = f.nextInt(), c1 = f.nextInt(), r2 = f.nextInt(), c2 = f.nextInt();
                if(c1 != r2) {
                    System.out.println("SIZES NOT COMPATIBLE");
                    f.nextLine();
                    for (int i1 = 0; i1 < r1; i1++) {
                        f.nextLine();
                    }
                    for (int i1 = 0; i1 < r2; i1++) {
                        f.nextLine();
                    }
                }
                else
                {
                    System.out.println(r1 + "," + c2);
                    int[][] mtr1 = new int[r1][c1], mtr2 = new int[r2][c2], rtn = new int[r1][c2];
                    for (int x = 0; x < mtr1.length; x++) {
                        for (int j = 0; j < mtr1[0].length; j++) {
                            mtr1[x][j] = f.nextInt();
                        }
                    }
                    for (int x = 0; x < mtr2.length; x++) {
                        for (int j = 0; j < mtr2[0].length; j++) {
                            mtr2[x][j] = f.nextInt();
                        }
                    }
                    for (int x = 0; x < r1; x++) {
                        for (int j = 0; j < c2; j++) {
                            int num = 0;
                            for (int k = 0; k < mtr2.length; k++) {
                                num += mtr1[x][k] * mtr2[k][j];
                            }
                            rtn[x][j] = num;
                        }
                    }
                    for (int[] nums : rtn) {
                        for (int num : nums) {
                            System.out.printf("%5s", num);
                        }
                        System.out.println();
                    }
                }
                for (int i1 = 0; i1 < 12; i1++) {
                    System.out.print("^");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
