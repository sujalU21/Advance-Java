package org5e;

public class Print extends Thread {
    int total = 0;
    public void run(){
      synchronized (this){
          for(int i = 1;i<=100;i++){
              total+=i;
          }
          this.notify();
      }
    }
}
