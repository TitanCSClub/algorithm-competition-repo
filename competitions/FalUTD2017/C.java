import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C {

	private static final String FILE_NAME = "C.txt";
	private static String[][] rectangle;
	private static int x;
	private static int y;
	private static int moves = 0;

	public static void main(String[] args) throws FileNotFoundException {
		x = 0;
		y = 0;
		moves = 0;
		try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
			int cases = scanner.nextInt();
			for (int i = 0; i < cases; i++) {
				int xRange = scanner.nextInt();
				int yRange = scanner.nextInt();
				scanner.nextLine();
				rectangle = new String[xRange][yRange];
				for (int x = 0; x < rectangle.length; x++) {
					int index = 0;
					String[] line = scanner.nextLine().split("");
					for (int y = rectangle[x].length - 1; y >= 0; y--) {
						rectangle[x][y] = line[index];
						index++;
					}
				}
				for (int t = 0; t < rectangle.length; t++) {
					for (int y = 0; y < rectangle[t].length; y++) {
						System.out.print(rectangle[t][y]);
					}
					System.out.println();
				}
				System.out.println("SPLIT");
				setKnightCoordinates();
				move();
			}
		}
	}
	
	private static void setKnightCoordinates() {
		for (int x = 0; x < rectangle.length; x++) {
			for (int y = 0; y < rectangle[x].length; y++) {
				if (rectangle[x][y].equals("K")) {
					C.x = x;
					C.y = y;
				}
			}
		}
	}
	
	private static void move() {
		if (moveUp1() || moveUp2() || moveLeft1() || moveLeft2() || moveRight1() || moveRight2() || moveDown1() || moveDown2()) {
			if (x >= 0 && x < rectangle.length && y >= 0 && y < rectangle[x].length) {
				if (containsPrincess()) {
					System.out.println(moves);
				} else {
					System.out.println("test");
				}
			}
		}
	}
	
	private static boolean moveUp1() {
		if (canMove(-1, 2)) {
			x -= 1;
			y += 2;
			moves++;
		}
		return canMove(-1, 2);
	}
	
	private static boolean moveUp2() {
		if (canMove(1, 2)) {
			x += 1;
			y += 2;
			moves++;
		}
		return canMove(1, 2);
	}
	
	private static boolean moveLeft1() {
		if (canMove(-2, -1)) {
			x -= 2;
			y -= 1;
			moves++;
		}
		return canMove(-2, -1);
	}
	
	private static boolean moveLeft2() {
		if (canMove(-2, 1)) {
			x -= 2;
			y += 1;
			moves++;
		}
		return canMove(-2, 1);
	}
	
	private static boolean moveRight1() {
		if (canMove(2, -1)) {
			x += 2;
			y -= 1;
			moves++;
		}
		return canMove(2, -1);
	}
	
	private static boolean moveRight2() {
		if (canMove(2, 1)) {
			x += 2;
			y += 1;
			moves++;
		}
		return canMove(2, 1);
	}
	
	private static boolean moveDown1() {
		if (canMove(-1, -2)) {
			x -= 1;
			y -= 2;
			moves++;
		}
		return canMove(-1, -2);
	}
	
	private static boolean moveDown2() {
		if (canMove(1, 2)) {
			x += 1;
			y += 2;
			moves++;
		}
		return canMove(1, 2);
	}
	
	private static boolean canMove(int xOffset, int yOffset) {
		if (x + xOffset < 0 || x + xOffset >= rectangle.length || y + yOffset < 0 || y + yOffset >= rectangle[x + xOffset].length || y + yOffset >= rectangle[x].length) {
			return false;
		}
		String tile = rectangle[x + xOffset][y + yOffset];
		return tile.equals(".") || tile.equals("P");
	}
	
	private static boolean containsPrincess() {
		return rectangle[x][y].equals("P");
	}
}