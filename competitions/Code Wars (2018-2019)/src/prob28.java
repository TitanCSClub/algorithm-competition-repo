/*
import javafx.scene.shape.Line;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.*;
import java.io.*;
public class prob28 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("prob028"));
        ArrayList<String> alpha = new ArrayList<String>();
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();

        //Rectangle
        ArrayList<Integer> fx = new ArrayList<Integer>();
        ArrayList<Integer> fy = new ArrayList<Integer>();
        ArrayList<Integer> lx = new ArrayList<Integer>();
        ArrayList<Integer> ly = new ArrayList<Integer>();

        while(sc.hasNext()){
            String next = sc.next();
            if(next.equals("~"))
                break;
            alpha.add(next);
            x.add(Integer.parseInt(sc.next()));
            sc.next();
            y.add(Integer.parseInt(sc.next()));
        }
        while(sc.hasNext()){

            fx.add(Integer.parseInt(sc.next()));
            sc.next();
            fy.add(Integer.parseInt(sc.next()));

            lx.add(Integer.parseInt(sc.next()));
            sc.next();
            ly.add(Integer.parseInt(sc.next()));

        }
        ArrayList<String> traveled = new ArrayList<String>();


    }
    public boolean recursion(ArrayList<String> traveled, ArrayList<String> alpha, ArrayList<Integer> x, ArrayList<Integer> y , ArrayList<Integer> fx , ArrayList<Integer> fy, ArrayList<Integer> lx, , ArrayList<Integer> ly){
        String curr="";
        int ind =0;
        if(traveled.size()==0) {
            curr = alpha.get(0);
            ind = 0;
        }else {
            curr = traveled.get(traveled.size() - 1);
            ind = traveled.size()-1;
        }
            for(int i=1;i<alpha.size();i++){
            if(traveled.size()!=0 && traveled.contains(alpha.get(i))){
                continue;
            }
            if(doable(fx,fy,lx,ly,ind,i,x,y) ){
                traveled.add(alpha.get(i));
                recursion(traveled, alpha, x, y , fx, fy, lx, ly);
            }
        }
        return false;
    }
    public double distance(){
        */
/**//*

    }
    public static boolean doable(ArrayList<Integer> fx, ArrayList<Integer> fy,  ArrayList<Integer> lx,  ArrayList<Integer> ly, int ind, int i ,   ArrayList<Integer> x,   ArrayList<Integer> y ){

        for(int z=0;z<fx.size();z++){
//            Math.sqrt()
            if(Line2D.linesIntersect(fx.get(z),fy.get(z),lx.get(z),ly.get(z), x.get(i),y.get(i),x.get(ind),y.get(ind))){
                return false;
            }
        }
        return true;
    }

    public static int distance(){}
}

*/
