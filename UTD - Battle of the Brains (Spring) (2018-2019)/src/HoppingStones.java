import java.util.Scanner;

public class HoppingStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int caseNum = 0; caseNum < cases; caseNum++) {
            int stones = scanner.nextInt();
            int numMoves = scanner.nextInt();
            int[] moves = new int[numMoves];
            for (int i = 0; i < moves.length; i++) {
                moves[i] = scanner.nextInt();
            }
            System.out.println(numPath(stones, moves));
        }
    }

    private static int numPath(int stones, int[] moves) {
        int path = 0;

        for (int i = 0; i <moves.length; i++) {

            if (stones - moves[i] > 0) {
                path += numPath(stones - moves[i], moves);
            } else if (stones - moves[i] == 0) {
                return path + 1;
            }
        }
        return path;
    }
}
