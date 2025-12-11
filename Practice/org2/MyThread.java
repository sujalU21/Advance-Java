package org2;

public class MyThread extends Thread {
Display display;
String name;
public void run(){
    Display.print(name);
}
MyThread(Display display,String name){
    this.display=display;
    this.name=name;
}

}
