package streamprogram;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program12 {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(90);
        a1.add(45);
        a1.add(25);
        a1.add(10);

        List<Integer> res1 =a1.stream().distinct().collect(Collectors.toList());
        System.out.println(res1);
        Set<Integer> res2 =a1.stream().distinct().collect(Collectors.toSet());
        System.out.println(res2);

//        System.out.println(a1);
//        a1 = a1.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(a1);
//        a1 = a1.stream().toList().reversed();
//        System.out.println(a1);
//        int total = a1.stream().reduce(1,(a,b)->a+b);
//        System.out.println(total);

    }

}
