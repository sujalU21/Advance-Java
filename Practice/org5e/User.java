package org5e;

public class User {
    public static void main(String[] args) throws InterruptedException {
        Print p1 = new Print();
        p1.start();
        //Thread.sleep(1000);
        // we avoid thread.sleep() because it decrease the perfromance.
       // p1.join();
       synchronized (p1){
           p1.wait(1000);
           System.out.println(p1.total);
       }
    }
}
