package org8LamdaFunForRunneableinterfaceInThread;

public class Demo {
//    public static void main(String[] args) {
//        Runnable r1 =()->{
//            for(int i = 0;i<=10;i++){
//                System.out.println(Thread.currentThread());
//            }
//        };
//        Runnable r2 =()->{
//            for(int i = 0;i<=10;i++){
//                System.out.println(Thread.currentThread());
//            }
//        };

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for(int i = 0;i<=10;i++){
                System.out.println(Thread.currentThread());
            }
        });
        Thread t2 = new Thread(()->{
            for(int i = 0;i<=10;i++){
                System.out.println(Thread.currentThread());
            }
        });
        t1.start();
        t2.start();
    }

    }