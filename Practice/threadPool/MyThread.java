package threadPool;

public class MyThread  extends Thread{
    Number n;
    int i;

    public MyThread(Number n,int i){
        this.n=n;
        this.i= i;
    }

    @Override
    public void run() {
         n.print(i);
    }
}
