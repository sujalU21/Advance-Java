package org5DeadLock;

public class Print {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hi";
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                synchronized (s1){
                        System.out.println("Thread has arrived the lock of s1");
                    System.out.println("Thread 1 waiting to accurie s2 lock");
                }
            }
        };
    }
}
