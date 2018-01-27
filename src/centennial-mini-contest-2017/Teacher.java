import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Team6 on 11/13/2017.
 */
public class Teacher {
    static String[] answers = new String[100];
    static String[] studentAnswers = new String[100];
    static String studentName = "";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("teacher.in"));
        int points = scanner.nextInt();
        scanner.nextLine();

        int currInd = 0;
        boolean isKey = true;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains("STUDENT")) {
                if (!isKey) {
                    System.out.println(studentName + ": " + grade(answers, studentAnswers, points));
                }
                studentName = line;
                isKey = false;
                currInd = 0;
            } else {
                if (isKey) {
                    answers[currInd] = line;
                    currInd++;
                } else {
                    studentAnswers[currInd] = line;
                    currInd++;
                }
            }
        }
        System.out.println(studentName + ": " + grade(answers, studentAnswers, points));
    }

    public static int grade(String[] key, String[] student, int points) {
        int score = 0;
        for (int j = 0; j < student.length; j++) {
            if (student[j] != null && key[j] != null && student[j].equals(key[j])) {
                score += points;
            }
        }
        return score;
    }
}
