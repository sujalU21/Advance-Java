package org1Predicate;

import java.util.ArrayList;

public class ArrayListUsingLamda {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("apple");
        a1.add("orange");
        a1.add("kiwi");
//        for (String s :a1){
//            System.out.println(s);
//        }


        a1.forEach(a-> System.out.println(a));
    }
}
