package org1Predicate;

public class ConsumerDriver {
    public static void main(String[] args) {
        Consumer c = a-> System.out.println(a);
        c.accept(10);

        Consumer<String> c1 = a-> System.out.println(a.charAt(0));
        c1.accept("hello");
    }
}
