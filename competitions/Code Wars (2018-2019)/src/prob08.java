import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class prob08 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("prob08.txt"));

           String[] thing = sc.nextLine().split(" ");
           HashMap<String, Integer> temp = new HashMap<String, Integer>();
            System.out.println(thing.length);
           for(int i=0;i<thing.length-1;i++){
               System.out.println(thing[i]);
               switch(thing[i]){
                   case "0":
                       if(!temp.containsKey("Z") && temp.get("Z")<1)
                           temp.put("Z",1);
                       if(!temp.containsKey("E") && temp.get("E")<1)
                           temp.put("E",1);
                       if(!temp.containsKey("R") &&temp.get("R")<1)
                           temp.put("R",1);
                       if(!temp.containsKey("0") &&temp.get("O")<1)
                           temp.put("O",1);
                       break;
                   case "1":
                       if(!temp.containsKey("N") &&temp.get("N")<1)
                           temp.put("N",1);
                       if(!temp.containsKey("E") && temp.get("E")<1)
                           temp.put("E",1);
                       if(!temp.containsKey("O") &&temp.get("O")<1)
                           temp.put("O",1);

                       break;
                   case "2":
                       if(!temp.containsKey("T") &&temp.get("T")<1)
                           temp.put("T",1);
                       if(!temp.containsKey("W") &&temp.get("W")<1)
                           temp.put("W",1);
                       if(!temp.containsKey("O") &&temp.get("O")<1)
                           temp.put("O",1);

                       break;
                   case "3":
                       if(!temp.containsKey("T") &&temp.get("T")<1)
                           temp.put("T",1);
                       if(!temp.containsKey("E") &&temp.get("E")<2)
                           temp.put("E",2);
                       if(!temp.containsKey("R") &&temp.get("R")<1)
                           temp.put("R",1);
                       if(!temp.containsKey("H") &&temp.get("H")<1)
                           temp.put("H",1);

                       break;
                   case "4":
                       if(!temp.containsKey("F") &&temp.get("F")<1)
                           temp.put("F",1);
                       if(!temp.containsKey("O") &&temp.get("O")<1)
                           temp.put("O",1);
                       if(!temp.containsKey("U") &&temp.get("U")<1)
                           temp.put("U",1);
                       if(!temp.containsKey("R") &&temp.get("R")<1)
                           temp.put("R",1);

                       break;
                   case "5":
                       if(!temp.containsKey("V") &&temp.get("V")<1)
                           temp.put("V",1);
                       if(!temp.containsKey("E") &&temp.get("E")<1)
                           temp.put("E",1);
                       if(!temp.containsKey("F") &&temp.get("F")<1)
                           temp.put("F",1);
                       if(!temp.containsKey("I") &&temp.get("I")<1)
                           temp.put("I",1);

                       break;
                   case "6":
                       if(!temp.containsKey("S") &&temp.get("S")<1)
                           temp.put("S",1);
                       if(!temp.containsKey("I") &&temp.get("I")<1)
                           temp.put("I",1);
                       if(!temp.containsKey("X") &&temp.get("X")<1)
                           temp.put("X",1);

                       break;
                   case "7":
                       if(!temp.containsKey("S") &&temp.get("S")<1)
                           temp.put("S",1);
                       if(!temp.containsKey("E") &&temp.get("E")<2)
                           temp.put("E",2);
                       if(!temp.containsKey("V") &&temp.get("V")<1)
                           temp.put("V",1);
                       if(!temp.containsKey("N") &&temp.get("N")<1)
                           temp.put("N",1);

                       break;
                   case "8":
                       if(!temp.containsKey("E") &&temp.get("E")<1)
                           temp.put("E",1);
                       if(!temp.containsKey("I") &&temp.get("I")<1)
                           temp.put("I",1);
                       if(!temp.containsKey("G") &&temp.get("G")<1)
                           temp.put("G",1);
                       if(!temp.containsKey("H") &&temp.get("H")<1)
                           temp.put("H",1);
                       if(!temp.containsKey("T") &&temp.get("T")<1)
                           temp.put("T",1);

                       break;
                   case "9":
                       if(!temp.containsKey("N") &&temp.get("N")<2)
                           temp.put("I",2);
                       if(!temp.containsKey("I") &&temp.get("I")<1)
                           temp.put("I",1);
                       if(!temp.containsKey("E") &&temp.get("E")<1)
                           temp.put("E",1);
                       break;
                   case "10":
                       if(!temp.containsKey("T") &&temp.get("T")<1)
                           temp.put("T",1);
                       if(!temp.containsKey("E") &&temp.get("E")<1)
                           temp.put("E",1);
                       if(!temp.containsKey("N") &&temp.get("N")<1)
                           temp.put("N",1);
                       break;
                   case "11":
                       if(!temp.containsKey("E") &&temp.get("E")<3)
                           temp.put("E",3);
                       if(!temp.containsKey("L") &&temp.get("L")<1)
                           temp.put("L",1);
                       if(!temp.containsKey("N") &&temp.get("N")<1)
                           temp.put("N",1);
                       if(!temp.containsKey("V") &&temp.get("V")<1)
                           temp.put("V",1);

                       break;
                   case "12":
                       if(!temp.containsKey("T") &&temp.get("T")<1)
                           temp.put("T",1);
                       if(!temp.containsKey("W") &&temp.get("W")<1)
                           temp.put("W",1);
                       if(!temp.containsKey("E") &&temp.get("E")<2)
                           temp.put("E",2);
                       if(!temp.containsKey("L") &&temp.get("L")<1)
                           temp.put("L",1);
                       if(!temp.containsKey("V") &&temp.get("V")<1)
                           temp.put("V",1);
                       break;

               }
               for(int x=0;x<thing.length-2;x++){
                   System.out.print(thing[x]+" ");
               }
               System.out.println(thing[thing.length-2]+".");
               for(Map.Entry<String, Integer> E: temp.entrySet()){
                   for(int z=0;z<temp.get(E);z++){
                       System.out.println(E.getKey()+" ");
                   }
               }

           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static int recur(int a){
        if(a==1)
            return 1;
        return (int)Math.pow(a,2) + recur(a-1);

    }
}
