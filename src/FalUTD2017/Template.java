import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.*;

public class Template {

	private static final String FILE_NAME = "A.txt";

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
			while (scanner.hasNext()) {
				
			}
		}
	}

}
