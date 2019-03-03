import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("prob10.txt"))) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                if (line.length == 1) {
                    computeToAge(line[0].split(":"));
                } else {
                    computeAge(line);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void computeAge(String[] line) {
        LocalDateTime date1 = toLocaleDateTime(line[0]);
        LocalDateTime date2 = toLocaleDateTime(line[1]);
        long years = ChronoUnit.YEARS.between(date1, date2);
        System.out.println("If born on " + line[0] + ", will be " + years + " years old on " + line[1]);
    }

    private static void computeToAge(String[] line) {
        String date = line[0];
        int age = Integer.parseInt(line[1]);
        LocalDateTime time = toLocaleDateTime(date);
        if (age == 0) {
            time = time.plusYears(1);
            time = time.minusDays(1);
//            Rectangle2D
            System.out.println("Will still be " + age + " up to " + time.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")) + " " +
                    "if born on " + date);
        } else {
            time = time.plusYears(age);
            String good = age > 99 ? " (good job!)" : "";
            System.out.println("Will be " + age + " on " + time.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")) + " " +
                    "if born on " + date + good);
        }
    }

    private static LocalDateTime toLocaleDateTime(String dateRaw) {
        String[] raw = dateRaw.split("-");
        int year = Integer.parseInt(raw[0]);
        int month = Integer.parseInt(raw[1]);
        int day = Integer.parseInt(raw[2]);
        return LocalDateTime.of(year, month, day, 12, 0);
    }
}
