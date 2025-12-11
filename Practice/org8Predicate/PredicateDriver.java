package org8Predicate;

public class PredicateDriver {
    public static void main(String[] args) {
        Predicate<Integer> obj =  (a)->{return a%2==0;};
        Predicate<Double> obj1 =  (a)->a%2==0;

        System.out.println(obj.test(10));
        System.out.println(obj1.test(10.0));


        Predicate<String> obj2 = a->a.startsWith("a");
        System.out.println(obj2.test("abcd"));

    }
}
