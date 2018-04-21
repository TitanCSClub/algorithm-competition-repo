import java.io.File;
import java.io.FileNotFoundException;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Vincent {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("vincent.dat"));
        while (scanner.hasNextLine()) {
            String[] originalRaw = scanner.nextLine().split(" ");
            String times = scanner.nextLine();

            Date original = new Date(Integer.parseInt(originalRaw[0]), Integer.parseInt(originalRaw[1]) - 1, Integer.parseInt(originalRaw[2]), Integer.parseInt(originalRaw[3]), Integer.parseInt(originalRaw[4]));
            ArrayList<Date> dates = new ArrayList<>();
            Scanner timesScanner = new Scanner(times);
            while (timesScanner.hasNextLong()) {
                long millis = timesScanner.nextLong() * 60000;
                dates.add(new Date(original.getTime() + millis));
            }
            System.out.println(formattedDate(original));
            System.out.println("-----");
            for (Date date : dates) {
                System.out.println(formattedDate(date));
            }
            System.out.println("=====");
        }
    }

    private static String formattedDate(Date date) {
        String hours = num(Integer.parseInt(normallizeHour(date.getHours())));
        return fixCaps(Month.of(date.getMonth() + 1).toString()) + " " + num(date.getDate()) + ", "
                + date.getYear() + " - " + (hours.equals("00") ? "12" : hours) + ":" + num(date.getMinutes()) + " "
                + amOrPm(date.getHours());
    }

    private static String fixCaps(String words) {
        return words.substring(0, 1) + words.substring(1).toLowerCase();
    }

    private static String num(int num) {
        return num < 10 ? "0" + num : num + "";
    }

    private static String normallizeHour(int hour) {
        return hour < 12 ? hour + "" : (hour - 12) + "";
    }

    private static String amOrPm(int hour) {
        return (hour < 12) ? "AM" : "PM";
    }
}
