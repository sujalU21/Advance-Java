package streamprogram;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Program7 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        //Stream intitialization
        long res = a1.stream().filter(i -> i>=20).count() ;
        System.out.println(res);
    }
}
