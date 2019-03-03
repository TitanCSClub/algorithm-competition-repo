import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class prob21 {
    static int year = 0;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("prob21.txt"));
        String date = scanner.nextLine();
        LocalDateTime time = toLocaleDateTime(date);
        year = Integer.parseInt(date.split("-")[0]);
        Zodiac zodiac = Zodiac.of(time);
        Animal animal = Animal.of(year);
        String monthName = time.getMonth().toString().toLowerCase();
        monthName = monthName.substring(0, 1).toUpperCase() + monthName.substring(1);
        System.out.println("If you were born on " + monthName + " " + time.getDayOfMonth() + ", your sign is " + zodiac + ".");
        System.out.println(year + " is the year of the " + animal + ".");
    }

    private static LocalDateTime toLocaleDateTime(String dateRaw) {
        String[] raw = dateRaw.split("-");
        int year = Integer.parseInt(raw[0]);
        int month = Integer.parseInt(raw[1]);
        int day = Integer.parseInt(raw[2]);
        return LocalDateTime.of(year, month, day, 12, 0);
    }

    private static LocalDateTime think(int year, int month, int day) {
        return LocalDateTime.of(year, month, day, 12, 0);
    }

    enum Zodiac {
        ARIES(LocalDateTime.of(year, 3, 21, 12, 0), LocalDateTime.of(year, 4, 19, 12, 0)),
        TAURUS(think(year, 4, 20), think(year, 5, 20)),
        GEMINI(think(year, 5, 21), think(year, 6, 20)),
        CANCER(think(year, 6, 21), think(year, 7, 22)),
        LEO(think(year, 7, 23), think(year, 8, 22)),
        VIRGO(think(year, 8, 23), think(year, 9, 22)),
        LIBRA(think(year, 9, 23), think(year, 10, 22)),
        SCORPIO(think(year, 10, 23), think(year, 11, 21)),
        SAGITTARIUS(think(year, 11, 22), think(year, 12, 21)),
        CAPRICORN(think(year, 12, 22), think(year, 1, 19)),
        AQUARIUS(think(year, 1, 20), think(year, 2, 18)),
        PISCES(think(year, 2, 19), think(year, 3, 20))
        ;

        private final LocalDateTime from;
        private final LocalDateTime to;

        Zodiac(LocalDateTime from, LocalDateTime to) {
            this.from = from;
            this.to = to;
        }

        static Zodiac of(LocalDateTime time) {
            for (Zodiac zodiac : values()) {
                if (time.isAfter(zodiac.from) && time.isBefore(zodiac.to)) {
                    return zodiac;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            String name = name().toLowerCase();
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }
    }

    enum Animal {
        RAT(2008),
        OX(2009),
        TIGER(2010),
        RABBIT(2011),
        DRAGON(2012),
        SNAKE(2013),
        HORSE(2014),
        SHEEP(2015),
        MONKEY(2016),
        ROOSTER(2017),
        DOG(2018),
        PIG(2019);

        private final int year;

        Animal(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            String name = name().toLowerCase();
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        static Animal of(int year) {
            for (Animal value : values()) {
                if (value.year == year) {
                    return value;
                }
            }
            return null;
        }
    }
}
