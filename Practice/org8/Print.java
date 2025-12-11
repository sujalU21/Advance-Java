package org8;
@FunctionalInterface
public interface Print {
    public int m1(int a,int b);

    public static void main(String[] args) {
        Print obj =(a,b)->{
            System.out.println(a+b);
            return 100;
        };
        obj.m1(10,20);
    }
}
