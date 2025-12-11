package streamprogram;

import java.util.ArrayList;

public class Program8 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(102);
        a1.add(201);
        a1.add(32);
        a1.add(41);
        //Stream intitialization
      //  long res = a1.stream().filter(i -> i%5==0).count() ;
        //  System.out.println(res);

       boolean res =  a1.stream().anyMatch(i->i%5==0);
        System.out.println(res);
    }
}
