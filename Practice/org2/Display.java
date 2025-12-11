package org2;

public class Display {

    // It will occupie Object level Lock with not prefix static in method
//    public synchronized void print (String name){
//        for(int i = 1;i<=10;i++){
//            System.out.println(name);
//        }
//    }
    //#IMPORTANT__NOTE :=>
    //Every object wil have a lock and every class will have a lock
    // class level lock are accuried for static syncronized method
    // object level lock are accuried for non-static syncronized method


//    // It will occupie Class level Lock with prefix static in method
    public static synchronized void print (String name){
        for(int i = 1;i<=10;i++){
            System.out.println(name);
        }
    }
}
