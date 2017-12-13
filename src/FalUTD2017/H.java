import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class H {

	private static final String FILE_NAME = "H.txt";

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
			while (scanner.hasNext()) {
				double bx = scanner.nextDouble();
				double rx = bx/2;
				double cx = scanner.nextDouble();
				double cy = scanner.nextDouble();
				
				if (! (bx == 0 && cx == 0 && cy == 0))
				{	
					double R = (Math.sqrt(Math.pow(cx, 2) + Math.pow(cy, 2)) * Math.sqrt(Math.pow(cx-bx,2) + Math.pow(cy, 2)) * 0.5) / cy;
					double ry = cy - Math.sqrt(Math.pow(R, 2) - Math.pow(cx - rx,2));
					out.printf("%.4f", rx);
					out.print(" ");
					out.printf("%.4f", ry);
					out.println();
				}
			}
				
		}
	}

}
