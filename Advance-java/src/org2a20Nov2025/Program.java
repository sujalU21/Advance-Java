package org2a20Nov2025;

public class Program {
    public static void main(String[] args) {
        Function<String,Integer> obj = i->i.length();
        System.out.println(obj.apply("abcdefgh"));

        Function< Integer,String> obj2 = i->i+" Hello";
        System.out.println(obj2.apply(10));


//        Function<Double,Integer> obj2 = i->i*i;
//        System.out.println(obj2.apply(4.567));

    }
}
