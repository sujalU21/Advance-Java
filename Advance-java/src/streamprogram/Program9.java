package streamprogram;

import java.util.ArrayList;

public class Program9 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(102);
        a1.add(201);
        a1.add(32);
        a1.add(41);

      boolean res =   a1.stream().allMatch(i->i>0);
        System.out.println(res);
        //true ==> for all +ive values
        //false ==> for all -ive values
    }
}
