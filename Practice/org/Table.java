package org;

public class Table {

//    // By Using Synchronized Keyword( only we can use Synchronized keyword for method)
//    public synchronized void print (int num){
//        for(int i = 1; i<=10;i++){
//            System.out.println(num +"*"+i+"="+(num*i));
//        }
//    }
//
//    7*1=7
//            7*2=14
//            7*3=21
//            7*4=28
//            7*5=35
//            7*6=42
//            7*7=49
//            7*8=56
//            7*9=63
//            7*10=70
//            3*1=3
//            3*2=6
//            3*3=9
//            3*4=12
//            3*5=15
//            3*6=18
//            3*7=21
//            3*8=24
//            3*9=27
//            3*10=30
//            2*1=2
//            2*2=4
//            2*3=6
//            2*4=8
//            2*5=10
//            2*6=12
//            2*7=14
//            2*8=16
//            2*9=18
//            2*10=20
//            5*1=5
//            5*2=10
//            5*3=15
//            5*4=20
//            5*5=25
//            5*6=30
//            5*7=35
//            5*8=40
//            5*9=45
//            5*10=50
//


    // By Using Synchronized Block
//
//    public  void print (int num){
//       synchronized (this){
//           for(int i = 1; i<=10;i++){
//               System.out.println(num +"*"+i+"="+(num*i));
//           }
//       }
//        for(int i = 1; i<=5;i++){
//            System.out.println(Thread.currentThread().getName());
//        }
//    }
//
//3*1=3
//        3*2=6
//        3*3=9
//        3*4=12
//        3*5=15
//        3*6=18
//        3*7=21
//        3*8=24
//        3*9=27
//        3*10=30
//    Thread-0
//    Thread-0
//    Thread-0
//    Thread-0
//    Thread-0
//            2*1=2
//            2*2=4
//            2*3=6
//            2*4=8
//            2*5=10
//            2*6=12
//            2*7=14
//            2*8=16
//            2*9=18
//            2*10=20
//    Thread-3
//    Thread-3
//    Thread-3
//    Thread-3
//    Thread-3
//            7*1=7
//            7*2=14
//            7*3=21
//            7*4=28
//            7*5=35
//            7*6=42
//            7*7=49
//            7*8=56
//            7*9=63
//            7*10=70
//    Thread-2
//    Thread-2
//    Thread-2
//    Thread-2
//    Thread-2
//            5*1=5
//            5*2=10
//            5*3=15
//            5*4=20
//            5*5=25
//            5*6=30
//            5*7=35
//            5*8=40
//            5*9=45
//            5*10=50
//    Thread-1
//    Thread-1
//    Thread-1
//    Thread-1
//    Thread-1
}
