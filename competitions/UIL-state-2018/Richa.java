import java.io.*;
import static java.lang.System.*;
import java.util.*;

public class Richa {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("richa.dat"));

        int lass = in.nextInt();
        Map<Integer,Thing> map = new HashMap<>();
        for (int c=0; c<lass; c++) {
            int num = in.nextInt();
            String piece = in.nextLine().substring(1);
            map.put(num, new Thing(num, piece));
        }
        while (in.hasNext()) {
            String grade1 = in.next();
            int num1 = in.nextInt();
            String grade2 = in.next();
            int num2 = in.nextInt();
            double gpa1 = 0;
            double gpa2 = 0;
            //out.println(grade1 + " 000 " + grade2);
            switch(grade1.charAt(0)) {
                case 'A':
                    gpa1 = 4.5;
                    break;
                case 'B':
                    gpa1 = 3.5;
                    break;
                case 'C':
                    gpa1 = 2.5;
                    break;
                case 'D':
                    gpa1 = 1;
                    break;
                case 'F':
                    gpa1 = 0;
                    break;
            }
            if (grade1.length()>1) {
                if (grade1.charAt(1)=='-') {
                    gpa1 -= .25;
                } else {
                    gpa1 += .25;
                }
            }
            Thing thing1 = map.get(num1);
            if (thing1.honors&&gpa1>1.25) {
                gpa1+=.5;
            }

            //two
            switch(grade2.charAt(0)) {
                case 'A':
                    gpa2 = 4.5;
                    break;
                case 'B':
                    gpa2 = 3.5;
                    break;
                case 'C':
                    gpa2 = 2.5;
                    break;
                case 'D':
                    gpa2 = 1;
                    break;
                case 'F':
                    gpa2 = 0;
                    break;
            }
            if (grade2.length()>1) {
                if (grade2.charAt(1)=='-') {
                    gpa2 -= .25;
                } else {
                    gpa2 += .25;
                }
            }
            Thing thing2 = map.get(num2);
            if (thing2.honors&&gpa2>1.25) {
                gpa2+=.5;
            }
           // out.println("GG " + gpa1 +  " " + gpa2);
            int cred1 = thing1.credNum;
            int cred2 = thing2.credNum;
            gpa1 *= cred1;
            gpa2 *= cred2;
            double pointSum = gpa1+gpa2;
            int credSum = cred1+cred2;
           //
            // out.println("X " + cred1 + " " + cred2);
            //out.println("P" + pointSum);
           // out.println("C"+ credSum);
            double result = pointSum/credSum;
            out.printf("%.3f\n", result);

           // out.println(thing1.myNum +" -- " + thing2.myNum);


            in.nextLine(); //buffer
        }

    }

   static class Thing {
        public boolean honors;
        public int credNum;
        public int myNum;

        public Thing (int num, String chunk) {
            myNum = num;
            if (chunk.charAt(0)=='Y') {
                honors = true;
            } else {
                honors = false;
            }
            //out.println(chunk +" + k");
            switch(chunk.charAt(1)) {
                case 'Y':
                    credNum = 4;
                    break;
                case'S':
                    credNum = 2;
                    break;
                case 'Q':
                    credNum = 1;
                    break;
            }
           // out.println("resulting " + credNum);
        }

    }
}
