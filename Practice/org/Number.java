package org;

public class Number extends Thread{
    Table table;
    int num;
    Number(Table table,int num){
        this.table=table;
        this.num=num;
    }

//     @Override
//    public void run(){
//        table.print(num);
//     }
}
