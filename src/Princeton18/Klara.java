package Princeton18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Complete
 */
public class Klara {
    private static final String FILE_NAME = "klara.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));
        while (in.hasNext()) {
            int n = in.nextInt();
            in.nextLine();
            char[][] board = new char[n][n];
            for (int r = 0; r < n; r++) {
                char[] line = in.nextLine().toCharArray();
                for (int c = 0; c < line.length; c++) {
                    board[r][c] = line[c];
                }
            }
            int middle = n / 2;
            char dest = board[middle][middle];
            char block = 0;
            switch (dest) {
                case '#':
                    block = '.';
                    break;
                case '.':
                    block = '#';
                    break;
            }
            fill(board, middle, middle, dest, block);
            for (int r = 0; r < n; r++) {

                for (int c = 0; c < n; c++) {
                    out.print(board[r][c] + "");
                }
                out.println();
            }
            out.println("=====");
        }
    }

    public static void fill(char[][] board, int r, int c, char dest, char block) {
        if (r >= 0 && c >= 0 && r < board.length && c < board[0].length && board[r][c] != block && board[r][c] != '-') {
            board[r][c] = '-';
            fill(board, r - 1, c, dest, block);
            fill(board, r, c - 1, dest, block);
            fill(board, r + 1, c, dest, block);
            fill(board, r, c + 1, dest, block);
        }
    }
}
