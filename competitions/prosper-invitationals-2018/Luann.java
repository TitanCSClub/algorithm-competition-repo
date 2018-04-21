import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Correct
 */
public class Luann {
    private static final String FILE_NAME = "luann.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File(FILE_NAME));
        int numCharts = console.nextInt();
        for (int i = 0; i < numCharts; i++) {
            int numCoords = console.nextInt();
            String nextLine = console.nextLine();
            ArrayList<ArrayList<Integer>> coordList = new ArrayList<>();
            for (int j = 0; j < numCoords; j++) {
                String[] coords = console.nextLine().split(" ");
                int x = Integer.parseInt(coords[0]);
                int y = Integer.parseInt(coords[1]);
                ArrayList<Integer> coordinate = new ArrayList<Integer>();
                coordinate.add(x);
                coordinate.add(y);
                coordList.add(coordinate);
            }
            int maxX = 0;
            int maxY = 0;
            for (int j = 0; j < coordList.size(); j++) {
                if (coordList.get(j).get(0) > maxX) {
                    maxX = coordList.get(j).get(0);
                }
                if (coordList.get(j).get(1) > maxY) {
                    maxY = coordList.get(j).get(1);
                }
            }
            for (int j = maxY; j > 0; j--) {
                ArrayList<Integer> possible = new ArrayList<Integer>();
                for (int k = 0; k < coordList.size(); k++) {
                    if (coordList.get(k).get(1) == j) {
                        possible.add(coordList.get(k).get(0));
                    }
                }
                //Collections.sort(possible);
                System.out.print(j + "|");
                for (int k = 1; k < maxX + 1; k++) {
                    if (possible.indexOf(k) != -1) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.print("  ");
            for (int j = 0; j < maxX; j++) {
                System.out.print("_");
            }
            System.out.println();
            System.out.print("  ");
            for (int j = 1; j < maxX + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
            System.out.println("=====");
        }
    }
}
