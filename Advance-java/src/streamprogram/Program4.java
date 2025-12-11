package streamprogram;

import java.util.ArrayList;



public class Program4 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("abc");
        a1.add("efg");
        a1.add("hij");
        a1.stream().map(s->s.toUpperCase()).forEach(System.out::println);
    }
}
