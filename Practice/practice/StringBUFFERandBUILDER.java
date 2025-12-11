package practice;

public class StringBUFFERandBUILDER {
    public static void main(String[] args) throws InterruptedException {
//        StringBuilder builder1= new StringBuilder(); // irregular output
        StringBuffer builder1= new StringBuffer();  // regular output because it is a thtread safe

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1;i<=1000;i++){
                    builder1.append("A");
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1;i<=1000;i++){
                    builder1.append("A");
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(builder1.toString().length());

    }
}
