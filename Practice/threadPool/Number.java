package threadPool;

public class Number {
    public void print(int i){
        System.out.println(i + " "+Thread.currentThread());
    }
}
