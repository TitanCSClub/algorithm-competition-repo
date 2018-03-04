import java.io.FileNotFoundException;

/**
 * Correct for 1 point
 */
public class prob01 {
    private static final String FILE_NAME = "prob01.txt";

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner in = new Scanner(new File(FILE_NAME));
        //System.out.println("Salutations, " + in.nextLine() + "! We are the Fighting Sandcrabs from Port Lavaca HS!");
        /*while (in.hasNext()) {

        }*/
        /*int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {

        }*/
        long milli = System.currentTimeMillis();
        System.out.println(min());
        System.out.println(System.currentTimeMillis() - milli);
    }

    private static int min(int... nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        //return Arrays.stream(nums).min().getAsInt();
        return min;
    }
}
