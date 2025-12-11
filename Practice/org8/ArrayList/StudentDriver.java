package org8.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

    public static void main(String[] args) {
        ArrayList<Student> a1 = new ArrayList<>();
        a1.add(new Student("Z",1));
        a1.add(new Student("B",2));
        a1.add(new Student("H",3));


        Collections.sort(a1,(i,j)->j.getName().compareTo(i.getName()));
        System.out.println(a1);
    }

}
