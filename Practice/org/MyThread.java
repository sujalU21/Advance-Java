package org;

public class MyThread {
    public static void main(String[] args) {
        Table table=new Table();

        Number t1 = new Number(table,3 );
        Number t2 = new Number(table,5 );
        Number t3 = new Number(table,7 );
        Number t4 = new Number(table,2 );

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
