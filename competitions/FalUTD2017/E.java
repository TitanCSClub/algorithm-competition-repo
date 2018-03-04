import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class E {

	private static final String FILE_NAME = "E.txt";

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
			while (scanner.hasNext()) {
				int numPolygons = scanner.nextInt();
				for (int i = 0; i < numPolygons; i++) {
					int numVertices = scanner.nextInt();
					int[][] vertices = new int[numVertices][2];
					for (int j = 0; j < numVertices; j++) {
						vertices[j][0] = scanner.nextInt();
						vertices[j][1] = scanner.nextInt();
						//scanner.nextLine();
					}
					double prod1 = 0;
					for (int j = 0; j < numVertices - 1; j++) {
						prod1 += vertices[j][0] * vertices[j + 1][1];
					}
					prod1 += vertices[numVertices - 1][0] * vertices[0][1];
					double prod2 = 0;
					for (int j = 0; j < numVertices - 1; j++) {
						prod2 += vertices[j][1] * vertices[j + 1][0];
					}
					prod2 += vertices[numVertices - 1][1] * vertices[0][0];
					double area = Math.abs(prod1 - prod2) / 2;
					out.println(area);
				}
			}
		}
	}

}
