import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob15 {
    private static final String FILE_NAME = "Prob15.in.txt";
    private static char[] letters;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        /*while (scanner.hasNext()) {

        }*/
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            letters = scanner.nextLine().toCharArray();
            int[] nums = new int[letters.length];
            for (int i1 = 0; i1 < letters.length; i1++) {
                nums[i1] = toNum(letters[i1]);
            }
            convert(nums);
            for (int num : nums) {
                System.out.print(toCharacter(num));
            }
            System.out.println();
        }
    }

    static boolean inRange(int num, int min, int max) {
        return num >= min && num <= max;
    }

    static char toCharacter(int num) {
        return (char) (num + 64);
    }

    static int toNum(char letter) {
        return (int) (letter - 64);
    }

    static void convert(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (inRange(nums[i], 1, 5)) {
                nums[i] += 6;
            } else if (inRange(nums[i], 6, 10)) {
                nums[i] *= nums[i];
            } else if (inRange(nums[i], 11, 15)) {
                nums[i] = ((nums[i] % 3) * 5) + 1;
            } else if (inRange(nums[i], 16, 20)) {
                String[] n = String.valueOf(nums[i]).split("");
                int sums = 0;
                for (String s : n) {
                    sums += Integer.parseInt(s);
                }
                nums[i] = sums * 8;
            } else if (inRange(nums[i], 21, 26)) {
                int testNum = nums[i] - 1;
                for (; testNum >= 0; testNum--) {
                    if (nums[i] % testNum == 0) {
                        break;
                    }
                }
                nums[i] = testNum * 2;
            }
            int rem = nums[i] % 26;
            if (rem == 0) {
                nums[i] = toNum(letters[i]);
            } else {
                nums[i] = rem;
            }
        }
    }
}
