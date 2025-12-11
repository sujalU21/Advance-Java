package org;

public class SharedResources {
    int count = 0;

    public synchronized void incrementCount(){
        count++;
    }

//    public  void incrementCount(){
//        count++;
//    }
    public int getCount() {
        return count;
    }
}
