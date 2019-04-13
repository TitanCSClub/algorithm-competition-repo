import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Ariana {
    public static void main(String[] args) throws FileNotFoundException {
        String[] sent = {"i", "must", "not",  "tell", "lies."};

        int upInd =0;
        boolean up = true;
        for (int i=0; i<40; i++) {
            if (i>=9) {
                out.print(i+1 + " ");
            } else {
                out.print(i+1 + "  ");
            }

            //out.println(upInd + " " + sent.length);
            for (int z=0;z<sent.length; z++) {
                if (z==upInd) {
                    out.print(sent[z].toUpperCase() + " ");
                } else {
                    out.print(sent[z] + " ");
                }

            }
            out.println();
            if (up==true) {
                upInd++;
                if (upInd==sent.length) {
                    upInd-=2;
                    up = false;
                }
            } else {
                upInd--;
                if (upInd==-1) {
                    upInd+=2;
                    up = true;
                }
            }

        }

    }
}
