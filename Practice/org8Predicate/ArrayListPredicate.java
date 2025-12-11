package org8Predicate;

import java.util.ArrayList;

public class ArrayListPredicate {
    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<>();
        a1.add(10);
        a1.add(-1);
        a1.add(14);
        a1.add(10);
        a1.add(10);

        a1.removeIf(a->a==10);
        System.out.println(a1);
    }
}
