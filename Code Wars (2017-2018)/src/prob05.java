import java.io.File;
import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Not submitted
 */
public class prob05 {
    private static final String FILE_NAME = "prob05.txt";
    private static int[][] calendar;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        /*while (in.hasNext()) {

        }*/
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            String day = scanner.next();
            int highlight = scanner.nextInt();
            calendar = new int[5][20];
            for (int i1 = 0; i1 < calendar.length; i1++) {
                for (int i2 = 0; i2 < calendar[i1].length; i2++) {
                    calendar[i1][i2] = -1;
                }
            }
            int starting = 1 + ((DayOfWeek.valueOf(day.toUpperCase()).getValue() - 1) * 3);
            int currNum = 1;
            for (int r = 0; r < calendar.length; r++) {
                for (int c = r == 0 ? starting : r; c < calendar[r].length; c++) {
                    if (currNum < 10) {
                        if (c % 3 == 0) {
                            continue;
                        } else {
                            calendar[r][c] = currNum;
                        }
                    } else if (c != 19) {
                        calendar[r][c++] = Integer.parseInt(String.valueOf(currNum).charAt(0) + "");
                        calendar[r][c] = Integer.parseInt(String.valueOf(currNum).charAt(0) + "");
                    }
                    currNum++;
                }
            }
            int[] indices = findIndices(highlight);
            for (int index : indices) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }

    private static int[] findIndices(int highlight) {
        ArrayList<Integer[]> indices = new ArrayList<>();
        String[] splitNum = String.valueOf(highlight).split("");
        for (int i = 0; i < calendar.length; i++) {
            for (int i1 = 0; i1 < calendar[i].length; i1++) {
                if (calendar[i][i1] == Integer.parseInt(splitNum[0])) {
                    indices.add(new Integer[]{i, i1});
                }
            }
        }
        for (Integer[] index : indices) {
            if (highlight > 10 && (index[1] % 3 == 0)) {
                if (Integer.parseInt(calendar[index[0]][index[1]] + "" + calendar[index[0]][index[1] + 1]) == highlight) {
                    return new int[]{index[0], index[1], index[1] + 1};
                }
            } else if (highlight < 10 && calendar[index[0]][index[1]] == highlight) {
                return new int[]{index[0], index[1]};
            }
        }
        return null;

    }
}
