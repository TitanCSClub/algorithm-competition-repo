import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Romero {
    private static String FILE_NAME = "romero.dat";

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        /*while (scanner.hasNext()) {

        }*/
        printWithSpacing("", "Date", 1, 20);
        printWithSpacing("", "Attendance", 19, 30);
        printWithSpacing("", "Gross", 30, 41);
        printWithSpacing("", "ATP", 41, 47);
        printWithSpacing("", "STP", 47, 53);
        printWithSpacing("", "Adults", 53, 61);
        printWithSpacing("", "Stu/Child", 61, 70);
        System.out.print("|");
        System.out.println();
        int cases = scanner.nextInt();
        for (int counter = 0; counter < cases; counter++) {
            String date = scanner.next();
            int attendance = scanner.nextInt();
            double gross = scanner.nextDouble();
            double atp = scanner.nextDouble();
            double stp = scanner.nextDouble();
            double child = 0;
            double adult = 0;
            if (Math.max(atp, stp) == atp) {
                double gross2 = Math.max(atp, stp) * attendance;
                double divisor = atp-stp;
                child = Math.abs(gross - gross2) / divisor;
                adult = attendance - child;
            } else {
                double gross2 = Math.max(atp, stp) * attendance;
                double divisor = Math.max(atp, stp) - Math.min(atp, stp);
                adult = Math.abs(gross - gross2) / divisor;
                child = attendance - adult;
            }
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Date c = sdf.parse(date);
            SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM dd, yyyy");
            date = sdf2.format(c);
            printWithSpacing("", date, 1, 20);
            printWithSpacing("", attendance, 19, 30);
            printWithSpacing("$%,9.2f", gross, 30, 41);
            printWithSpacing("$%.2f", atp, 41, 47);
            printWithSpacing("$%.2f", stp, 47, 53);
            printWithSpacing("", (int) adult, 53, 61);
            printWithSpacing("", (int) child, 61, 70);
            System.out.print("|");
            System.out.println();
        }
    }

    private static void printWithSpacing(String regex, Object output, int fromSpace, int tillSpace) {
        if (regex.length() != 0) {
            System.out.printf(regex, output);
        } else {
            System.out.print(output);
        }
        String out = regex.length() == 0 ? output.toString() : String.format(regex, output);
        for (int i = 0; i < tillSpace - (fromSpace + out.length()); i++) {
            System.out.print(" ");
        }
    }
}
