package streamprogram;

import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(21);
        a1.add(40);
        a1.add(43);
       // System.out.println(a1);
        a1.stream().filter(i->i%2==0).forEach(System.out::println);

    }
}
       /*  output
           10
           40
       */
