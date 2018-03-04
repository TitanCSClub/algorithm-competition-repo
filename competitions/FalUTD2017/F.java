import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class F {

	private static final String FILE_NAME = "F.txt";
	public static ArrayList<String> matches = new ArrayList();
	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
			int sets = scanner.nextInt();
			
			for (int i=0; i < sets; i++) {
				String line1 = scanner.nextLine();
				String line2 = scanner.nextLine();
				char[] chars1 = line1.toCharArray();
				char[] chars2 = line2.toCharArray();
				matches = new ArrayList();
				
			}
		}
	}

	public static HashMap findMatch(HashMap<String, Integer> input) {
		HashMap<String, Integer> matches = new HashMap<>();
		matches.putAll(input);
		//matches.put();
		return matches;
	}
}
