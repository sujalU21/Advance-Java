package org8.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(-1);
        a1.add(100);
        a1.add(200);


//        Collections.sort(a1);
//        System.out.println(a1); //[ -1,100,200]


//        Comparator<Integer> c = (i,j)->{ return j-i;};
//        Collections.sort(a1,c);
//        System.out.println(a1); //[200, 100, -1]



//        Comparator<Integer> c = (i,j)->j-i;
//        Collections.sort(a1,c);
//        System.out.println(a1); //[200, 100, -1]



//          Collections.sort(a1,(i,j)->j-i);
//          System.out.println(a1); //[200, 100, -1]


    }
}
