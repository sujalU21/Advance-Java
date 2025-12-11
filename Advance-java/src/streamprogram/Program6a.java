package streamprogram;

import java.util.ArrayList;
import java.util.Optional;

public class Program6a {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("abc");
        a1.add("efz");
        a1.add("applz");
      //  a1.stream().filter(s->s.endsWith("z")).forEach(System.out::println);

     //   a1.stream().filter(s->s.charAt(s.length()-1)=='z').forEach(System.out::println);

      //  Optional<String> res = a1.stream().filter(s-> s.endsWith("z")).findAny();
       // System.out.println(res);
    }
}