import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prob13 {
    private static final String FILE_NAME = "Prob13.in.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        /*while (scanner.hasNext()) {

        }*/
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            ArrayList<Person> people = new ArrayList<>();
            int peopleCases = scanner.nextInt();
            scanner.nextLine();
            for (int i1 = 0; i1 < peopleCases; i1++) {
                people.add(new Person());
            }
            String[] rawInfo = scanner.nextLine().split("\\[");
            for (int i1 = 0; i1 < rawInfo.length; i1++) {
                rawInfo[i1] = rawInfo[i1].replace("],", "").replace("]", "");
            }
            //System.out.println(Arrays.toString(rawInfo));
            String[][] info = new String[rawInfo.length][peopleCases];
            for (int i1 = 2; i1 < rawInfo.length; i1++) {
                String[] splitInfo = rawInfo[i1].split(",");
                for (int i2 = 0; i2 < peopleCases; i2++) {
                    info[i1][i2] = splitInfo[i2];
                }
            }
            for (int p = 0; p < peopleCases; p++) {
                people.get(p).name = info[2][p];
            }
            for (int p = 0; p < peopleCases; p++) {
                people.get(p).age = info[3][p];
            }
            for (int p = 0; p < peopleCases; p++) {
                people.get(p).insta = info[4][p];
            }
            for (int p = 0; p < peopleCases; p++) {
                people.get(p).twitter = info[5][p];
            }
            for (int p = 0; p < peopleCases; p++) {
                people.get(p).phone = info[6][p];
            }
            for (int p = 0; p < peopleCases; p++) {
                people.get(p).email = info[7][p];
            }
            for (int i1 = 0; i1 < peopleCases; i1++) {
                String name = scanner.nextLine();
                for (Person person : people) {
                    if (person.name.equals(name)) {
                        System.out.println(person);
                    }
                }
            }
        }
    }

    static class Person {
        String name, insta, twitter, phone, email, age;

        @Override
        public String toString() {
            return "Name: " + name + "\n" +
                    "Age: " + age + "\n" +
                    "Instagram: " + insta + "\n" +
                    "Twitter: " + twitter + "\n" +
                    "Phone: " + phone + "\n" +
                    "Email: " + email;
        }
    }
}
