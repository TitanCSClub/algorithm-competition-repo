import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B {

	private static final String FILE_NAME = "B.txt";
	

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
			int inputAmount = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0; i < inputAmount; i++) {
				if (scanner.hasNextLine()) {
					String[] line = scanner.nextLine().split(" ");
					int radix = Integer.parseInt(line[0]);
					String range1 = line[1];
					String range2 = line[2];
					
					long decRange1 = Long.parseLong(range1, radix);
					long decRange2 = Long.parseLong(range2, radix);
					long sumDigits = 0;
					for (long j = decRange1; j < decRange2 + 1; j++) {
						String radixString = Long.toString(j, radix);
						String[] radixStringArray = radixString.split("");
						sumDigits += sumOfDigits(radixStringArray,radix);
					}
					String printDigits = Long.toString(sumDigits, radix).toUpperCase();
					System.out.println(printDigits);
				}
			}
		}
	}
	
	private static long sumOfDigits(String[] digits, int radix) {
		int sum = 0;
		for (String digit : digits) {
			sum += Long.parseLong(digit, radix);
		}
		return sum;
	}

}
