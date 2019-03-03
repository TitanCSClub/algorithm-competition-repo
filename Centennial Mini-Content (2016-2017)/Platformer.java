import java.util.Scanner;

public class Platformer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            String[] rectangleOne = scanner.nextLine().split(" ");
            String[] rectangleTwo = scanner.nextLine().split(" ");
            int[] rectangleOneTopLeft = {Integer.parseInt(rectangleOne[0]), Integer.parseInt(rectangleOne[1])};
            int[] rectangleOneBottomRight = {Integer.parseInt(rectangleOne[2]), Integer.parseInt(rectangleOne[3])};
            int[] rectangleTwoTopLeft = {Integer.parseInt(rectangleTwo[0]), Integer.parseInt(rectangleTwo[1])};
            int[] rectangleTwoBottomRight = {Integer.parseInt(rectangleTwo[2]), Integer.parseInt(rectangleTwo[3])};

            if (isInBorder(rectangleOneTopLeft, rectangleTwoTopLeft, rectangleTwoBottomRight)
                    || isInBorder(rectangleOneBottomRight, rectangleTwoTopLeft, rectangleTwoBottomRight)
                    || isInBorder(rectangleTwoTopLeft, rectangleOneTopLeft, rectangleOneBottomRight)
                    || isInBorder(rectangleTwoBottomRight, rectangleOneTopLeft, rectangleOneBottomRight)) {
                System.out.println("COLLISION DETECTED");
            } else {
                System.out.println("NO COLLISION");
            }
        }
    }

    private static boolean isInBorder(int[] location, int[] boundaryTopLeft, int[] boundaryBottomRight) {
        return location[0] <= boundaryBottomRight[0] && location[0] >= boundaryTopLeft[0] && location[1] >= boundaryBottomRight[1] && location[1] <= boundaryTopLeft[1];
    }
}
    