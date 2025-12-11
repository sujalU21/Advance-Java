package org;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
    public static void main(String[] args) throws Exception {
        System.out.println("main Started");
//        SharedResources s = new SharedResources();
        ArrayList a1 = new ArrayList();
//        For arraylist we wil get irregular output
//        CopyOnWriteArrayList a1 = new CopyOnWriteArrayList();
//                For CopyOnWritearraylist we wil get regular output
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++) {
                   // s.incrementCount();
                    a1.add(i);
                }

            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
//                    s.incrementCount();
                    a1.add(i);
                }
            }
        };
        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

//        System.out.println(s.getCount());
        System.out.println(a1.size());
        System.out.println("main end");
    }



}
