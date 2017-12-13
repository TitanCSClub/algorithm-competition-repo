import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.System.*;

public class A {

	private static final String FILE_NAME = "A.txt";

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
			while (scanner.hasNextLine()) {
				int number = scanner.nextInt();
				scanner.nextLine();
				int sumParts = 0;
				if (number != 0) {
					if (scanner.hasNextLine()) {
						String[] numbersString = scanner.nextLine().split(" ");
						int[] numbers = new int[numbersString.length];
						for (int i = 0; i < numbersString.length; i++) {
							numbers[i] = Integer.parseInt(numbersString[i]);
						}
						int maxNumber = maxNumber(numbers);
						for (int num : numbers) {
							sumParts += num;
						}
						Integer[] divisors = divisorsOf(sumParts);
						for (int k = 0; k < divisors.length; k++) {
							if (divisors[k] > maxNumber) {
								out.println(divisors[k]);
								break;
							}
						}
					}
				} else {
					break;
				}
			}
		}
	}
	
	private static int maxNumber(int[] numbers) {
		int winningNumber = 0;
		for (int number : numbers) {
			if (winningNumber < number) {
				winningNumber = number;
			}
		}
		return winningNumber;
	}
	
	private static Integer[] divisorsOf(int totalNumber) {
		ArrayList<Integer> divisors = new ArrayList<>();
		for (int i = 0; i <= totalNumber; i++) {
			if (totalNumber % i == 0) {
				divisors.add(i);
			}
		}
		return divisors.toArray(new Integer[divisors.size()]);
	}

}
