import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Not submitted
 */
public class prob15 {
    private static final String FILE_NAME = "prob15.txt";
    private static boolean[][] blankShow;
    private static char[][] grid;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(FILE_NAME));
        int wordNum = in.nextInt();
        int SL = in.nextInt();
        in.nextLine();
        String[] toFind = new String[wordNum];
        for (int w = 0; w < wordNum; w++) {
            toFind[w] = in.nextLine();
        }
        grid = new char[SL * 2 - 1][SL * 2 - 1];
        boolean[][] show = new boolean[SL * 2 - 1][SL * 2 - 1];
        blankShow = new boolean[SL * 2 - 1][SL * 2 - 1];
        for (int r = 0; r < SL * 2 - 1; r++) {
            char[] line = in.nextLine().toCharArray();
            for (int c = 0; c < SL * 2 - 1; c++) {
                if (c < line.length) {
                    grid[r][c] = line[c];
                    if (line[c] == ' ') {
                        show[r][c] = true;
                        blankShow[r][c] = true;
                    } else {
                        show[r][c] = false;
                        blankShow[r][c] = false;
                    }
                } else {
                    grid[r][c] = ' ';
                }
            }
        }

        for (int s = 0; s < toFind.length; s++) {
            String word = toFind[s];
            boolean[][] toMerge = null;
            for (int r = 0; r < grid.length; r++) {
                for (int c = 0; c < grid[0].length; c++) {
                    if (word.charAt(0) == grid[r][c]) {
                        toMerge = go(r, c, word, blankShow(), 0);
                        break;
                    }
                }
            }
            for (int r = 0; r < grid.length; r++) {
                for (int c = 0; c < grid[0].length; c++) {
                    if (toMerge[r][c] == true) {
                        show[r][c] = true;
                    }
                }
            }
        }

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (show[r][c] == true) {
                    out.print(grid[r][c]);
                } else {
                    out.print(".");
                }
            }
            out.println();
        }
    }

    public static boolean[][] go(int r, int c, String toFind, boolean[][] beenThere, int indLett) {
        try {
            if (indLett == toFind.length()) {
                return beenThere;
            } else if (grid[r][c] == toFind.charAt(indLett)) {

                int checkR = r;
                int checkC = c - 1;
                boolean[][] toPass = dupe(beenThere);
                toPass[checkR][checkC] = true;
                go(checkR, checkC, toFind, toPass, indLett + 1);


                checkR = r;
                checkC = c + 1;
                toPass = dupe(beenThere);
                toPass[checkR][checkC] = true;
                go(checkR, checkC, toFind, toPass, indLett + 1);

                checkR = r + 1;
                checkC = c;
                toPass = dupe(beenThere);
                toPass[checkR][checkC] = true;
                go(checkR, checkC, toFind, toPass, indLett + 1);

                checkR = r - 1;
                checkC = c;
                toPass = dupe(beenThere);
                toPass[checkR][checkC] = true;
                go(checkR, checkC, toFind, toPass, indLett + 1);

                checkR = r - 1;
                checkC = c - 1;
                toPass = dupe(beenThere);
                toPass[checkR][checkC] = true;
                go(checkR, checkC, toFind, toPass, indLett + 1);

                checkR = r - 1;
                checkC = c + 1;
                toPass = dupe(beenThere);
                toPass[checkR][checkC] = true;
                go(checkR, checkC, toFind, toPass, indLett + 1);


                checkR = r + 1;
                checkC = c + 1;
                toPass = dupe(beenThere);
                toPass[checkR][checkC] = true;
                go(checkR, checkC, toFind, toPass, indLett + 1);

                checkR = r + 1;
                checkC = c - 1;
                toPass = dupe(beenThere);
                toPass[checkR][checkC] = true;
                go(checkR, checkC, toFind, toPass, indLett + 1);

            }
        } catch (Exception e) {

        }
        return beenThere;
    }

    public static boolean[][] dupe(boolean[][] toDupe) {
        boolean[][] clone = new boolean[blankShow.length][blankShow[0].length];
        for (int r = 0; r < clone.length; r++) {
            for (int c = 0; c < clone[0].length; c++) {
                clone[r][c] = toDupe[r][c];
            }
        }
        return clone;
    }

    public static boolean[][] blankShow() {
        boolean[][] clone = new boolean[blankShow.length][blankShow[0].length];
        for (int r = 0; r < clone.length; r++) {
            for (int c = 0; c < clone[0].length; c++) {
                clone[r][c] = blankShow[r][c];
            }
        }
        return clone;
    }

}
