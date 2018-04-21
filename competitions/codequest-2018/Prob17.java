import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;
import java.util.*;
public class Prob17 {
    private static final String FILE_NAME = "Prob17.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));

        int cases = in.nextInt();
        //out.println(cases);
        in.nextLine();
        for (int ca = 0; ca < cases; ca++) {
            String[][] board = new String[3][3];
            String[] line = in.nextLine().split("");
            int i=0;
            for (int r=0; r<3; r++) {
                for (int c=0; c<3; c++) {
                    board[r][c] = line[i];
                    i++;
                }
            }
            //check seven situations

            String curr = board[0][0];
            boolean currWin = true;
            for (int r=1; r<3; r++) {
                if (!board[r][0].equals(curr) || board[r][0].equals("-")) {
                    currWin = false;
                    break;
                }
            }
            if (currWin==true) {
                printBoard(board);
                out.println(" = " + curr + " WINS");
                continue;
            }

            curr = board[0][0];
            currWin = true;
            for (int c=1; c<3; c++) {
                if (!board[0][c].equals(curr) || board[0][c].equals("-")) {
                    currWin = false;
                    break;
                }
            }
            if (currWin==true) {
                printBoard(board);
                out.println(" = " + curr + " WINS");
                continue;
            }

            curr = board[0][0];
            currWin = true;
            for (int c=1; c<3; c++) {
                if (!board[c][c].equals(curr) || board[c][c].equals("-")) {
                    currWin = false;
                    break;
                }
            }
            if (currWin==true) {
                printBoard(board);
                out.println(" = " + curr + " WINS");
                continue;
            }

            curr = board[0][2];
            currWin = true;
            for (int c=1; c<3; c++) {
                if (!board[c][2-c].equals(curr) || board[c][2-c].equals("-")) {
                    currWin = false;
                    break;
                }
            }
            if (currWin==true) {
                printBoard(board);
                out.println(" = " + curr + " WINS");
                continue;
            }

            curr = board[0][1];
            currWin = true;
            for (int c=1; c<3; c++) {
                if (!board[c][1].equals(curr) || board[c][1].equals("-")) {
                    currWin = false;
                    break;
                }
            }
            if (currWin==true) {
                printBoard(board);
                out.println(" = " + curr + " WINS");
                continue;
            }

            curr = board[1][0];
            currWin = true;
            for (int c=1; c<3; c++) {
                if (!board[1][c].equals(curr) || board[1][c].equals("-")) {
                    currWin = false;
                    break;
                }
            }
            if (currWin==true) {
                printBoard(board);
                out.println(" = " + curr + " WINS");
                continue;
            }

            curr = board[2][0];
            currWin = true;
            for (int c=1; c<3; c++) {
                if (!board[2][c].equals(curr) || board[2][c].equals("-")) {
                    currWin = false;
                    break;
                }
            }
            if (currWin==true) {
                printBoard(board);
                out.println(" = " + curr + " WINS");
                continue;
            }

            curr = board[0][2];
            currWin = true;
            for (int c=1; c<3; c++) {
                if (!board[c][2].equals(curr) || board[c][2].equals("-")) {
                    currWin = false;
                    break;
                }
            }
            if (currWin==true) {
                printBoard(board);
                out.println(" = " + curr + " WINS");
                continue;
            }


            printBoard(board);
            out.println(" = TIE");

        }
    }
    public static void printBoard (String[][] board) {
        for (int r=0; r<3; r++) {
            for (int c=0; c<3; c++) {
                out.print(board[r][c]);
            }
        }
    }
}
