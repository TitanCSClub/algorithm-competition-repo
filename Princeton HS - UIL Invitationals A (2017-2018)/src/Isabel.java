package Princeton18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.System.out;

/**
 * Very sadly not correct, the problem is Calendar class takes month as starting from 0
 * (i.e. January = 0).
 */
public class Isabel {
    private static final String FILE_NAME = "isabel.dat";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        ArrayList<Person> people = new ArrayList<>();
        Calendar calendar = new GregorianCalendar();

        while (scanner.hasNextLine()) {
            String line[] = scanner.nextLine().split(" ");
            //out.println(Arrays.toString(line));
            people.add(new Person(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3])));
        }
        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

    static class Person implements Comparable<Person> {
        private final String name;
        private final int year;
        private final int month;
        private final int day;
        private final String[] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        private final String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        private final Calendar calendar = new GregorianCalendar(Locale.US);
        private final Date date = new Date();
        String dayOfWeek = null;
        int dayInt = 0;

        Person(String name, int year, int month, int day) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
            calendar.set(year, month, day);
            date.setTime(calendar.getTimeInMillis());
            String dayOfWeek = date.toString().substring(0, 3);
            out.println(name);
            out.println(dayOfWeek);
            int index = -1;
            for (int i = 0; i < days.length; i++) {
                if (days[i].startsWith(dayOfWeek)) {
                    index = i;
                    break;
                }
            }
            this.dayOfWeek = days[index];
            dayInt = index;
            /*dayInt += 4;
            dayInt %= 7;*/
        }

        @Override
        public String toString() {
            return name + "\t: " + days[dayInt] + ", ";
        }

        @Override
        public int compareTo(Person o) {
            if (dayInt > o.dayInt) {
                return 1;
            } else if (dayInt < o.dayInt) {
                return -1;
            }
            return name.compareTo(o.name);
        }
    }
}
