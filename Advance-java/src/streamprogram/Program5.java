package streamprogram;

import java.util.ArrayList;

public class Program5 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("abc");
        a1.add("efg");
        a1.add("apple");
      // a1.stream().filter(s->s.startsWith("a")).findFirst().stream().limit(2).forEach(System.out::println);
      // a1.stream().filter(s->s.startsWith("a")).limit(2).forEach(System.out::println);
        // a1.stream().filter(s->s.startsWith("a")).skip(1).forEach(System.out::println);

       // a1.stream().filter(s->s.startsWith("a")).forEach(System.out::println);
        //output
        // abc
        // apple
    }
}
