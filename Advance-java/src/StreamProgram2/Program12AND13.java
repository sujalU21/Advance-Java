package StreamProgram2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program12AND13 {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(90);
        a1.add(45);
        a1.add(25);
        a1.add(10);

       // a1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print); //90 45 25 10 10
       // a1.stream().sorted((a,b)->a-b).toList().forEach(System.out::print); //10 10 25 45 90
      // a1.stream().sorted((a,b)->b-a).toList().forEach(System.out::print);
       //90 45 25 10 10

    }
}
