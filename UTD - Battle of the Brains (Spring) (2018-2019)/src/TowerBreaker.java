import java.io.*;
import java.util.*;

public class TowerBreaker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        boolean[] list = new boolean[2 * (int)Math.pow(10, 6 ) +1];
        ArrayList<Integer> casess = new ArrayList<Integer>();

        for(int i=0;i<cases;i++){
            casess.add(sc.nextInt());
        }
        Collections.sort(casess);

        list[1] = true;
        list[3] = true;
        for(int j=4;j<=casess.get(casess.size()-1);j++){

            boolean did = false;
            for(int i=2;i<=Math.ceil(j/2.0);i++){

                if(j % i ==0){

                    if(list[j-i] == false){

                        list[j] = true;
                        did = true;
                        break;
                    }

                }
            }

            if(!did)
                list[j] = !list[j-1];
            did = false;
            System.out.print(j+""+list[j]+" ");
        }


        for(int i=0;i<casess.size();i++){
            System.out.print(casess.get(i));
            if(list[casess.get(i)] == true)
                System.out.println("Puffy");
            else
                System.out.println("Anne");
        }
    }

}