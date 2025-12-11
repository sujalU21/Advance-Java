package org20Nov2025;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(13,10);
        hm.put(17,17);
        hm.put(19,19);
        hm.put(21,21);
        hm.put(7,7);
        hm.put(33,33);
        //this wiil store in linklist from by comparing the value or element at same
        //index then it will add the value at same index individually
        // HashMap can store multi value at same index if keys are different
        //But if keys are same then it will replace the  exitsiting value with new value
        //hm.put(17,33);
        //this will replace 17%16(initial capacity) then here value is allready present
        //inside 1st index so by equal methed hashmap wiil compare key firstly then if
        //keies are same then it will compare the value present at that index
        //And it will replace the old value 17 with 33

        System.out.println(hm);
    }
}
