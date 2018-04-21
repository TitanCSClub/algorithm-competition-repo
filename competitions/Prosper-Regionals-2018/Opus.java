import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Opus {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("opus.dat"));
        String[] key = scanner.nextLine().replace("KEY " , "").split(" ");
        HashMap<String, TreeSet<Student>> classes = new HashMap<>();
        for (int i = 1; i <= 6; i++) {
            classes.put(i + "A", new TreeSet<>());
        }
        while (scanner.hasNextLine()) {
            String student = scanner.nextLine();
            classes.get(student.split(" ")[3]).add(new Student(student.split(" ")[0], student.split(" ")[1], student.split(" ")[2], student.split(" ")[3], student.substring(student.indexOf(student.split(" ")[3]) + 1)));
            for (Student student1 : classes.get(student.split(" ")[3])) {
                compareAnswers(student1, key);
            }
        }
        for (int i = 1; i <= classes.keySet().size(); i++) {
            System.out.println(classes.get(i + "A").first().group);
            int rank = 1;
            /*for (int i1 = 0; i1 < classes.get(i + "A").size(); i1++) {
                if (rank > 2 && classes.get((rank - 1) + "A").)
            }*/
        }
    }

    static void compareAnswers(Student s, String[] key) {
        for (int i = 0; i < s.answers.length; i++) {
            if (s.answers[i].equals(key[i])) {
                s.score += 6;
                s.amountCorrect++;
            } else if (s.answers[i].equals("S")) {
                continue;
            } else {
                s.score -= 2;
            }
            s.amountAnswered++;
        }
    }
    static class Student implements Comparable<Student> {
        int score;
        String firstName, lastName, school;
        String group;
        String[] answers;
        int amountCorrect, amountAnswered;

        Student(String firstName, String lastName, String school, String group, String answers) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.school = school;
            this.group = group;
            this.answers = answers.split(" ");
        }

        double percentage() {
            return (amountCorrect / amountAnswered) * 100;
        }

        @Override
        public int compareTo(Student o) {
            return score < o.score ? -1 : score > o.score ? 1 : percentage() < o.percentage() ? -1 : percentage() > o.percentage() ? 1 : 0;
        }

        public String toString() {
            return "";
        }
    }
}
