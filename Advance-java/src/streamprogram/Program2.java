package streamprogram;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        System.out.println(a1);
        a1.stream().map(i->i*i).forEach(System.out::println);

    }
}
