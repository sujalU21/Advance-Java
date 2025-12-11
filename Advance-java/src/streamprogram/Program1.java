package streamprogram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        //Stream intitialization
        a1.stream().filter(i-> 15 <= i).forEach(System.out::println);
        Stream.of(a1);

        HashSet<Integer> hs = new HashSet<>();
        //Stream intitialization
        hs.stream().forEach(System.out::println);
        Stream.of(hs);

        int[] a = {4,1,7};
        //Stream intitialization
        Arrays.stream(a).forEach(System.out::println);;

        String s = "wqwerty";
        //Stream intitialization
        s.chars().forEach(System.out::println);

    }
    }
