public class Bench {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < Math.pow(2, 50); i++) {
            String test =Integer.toBinaryString(i);
        }

    }
}
