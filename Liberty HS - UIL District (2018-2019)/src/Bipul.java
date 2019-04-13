public class Bipul {
    public static void main(String[] args) {
        System.out.println("|");
        print(1);
        for (int i = 3; i <= 9; i += 2) {
            print(i);
        }
        for (int i = 2; i <= 9; i++) {
            print(i);
        }
    }

    private static void print(int count) {
        StringBuilder thing = new StringBuilder();
        for (int i = 0; i < count; i++) {
            thing.append("#");
        }
        System.out.println("|" + thing.toString() + "\\");
    }
}
