package org2;

public class Demo {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();

        MyThread t1 = new MyThread(d1,"Ram");
        MyThread t2 = new MyThread(d2,"Sita");
        t1.start();
        t2.start();


    }
}
