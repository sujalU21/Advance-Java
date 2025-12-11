package streamprogram;

import java.util.ArrayList;
import java.util.Optional;

public class Program6 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("abc");
        a1.add("efg");
        a1.add("apple");
        a1.stream().filter(s -> s.startsWith("a")).limit(1).forEach(System.out::println);

        Optional<String> res = a1.stream().filter(s -> s.startsWith("a")).findFirst();
        System.out.println(res);
    }

}
