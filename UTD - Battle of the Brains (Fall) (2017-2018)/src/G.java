import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class G {

	private static final String FILE_NAME = "G.txt";

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
			while (scanner.hasNext()) {
				String currLine = scanner.nextLine();
				char[] lineArr = currLine.toCharArray();
				ArrayList<ArrayList<char[]>> stacks = new ArrayList<>();			
				stacks.add(new ArrayList<>());
				//stacks.set(0).set(0,)
			}
		}
	}

}
