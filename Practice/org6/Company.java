package org6;

public class Company {
    private String name;
    Company(String name){
        this.name=name;
    }
    private void display(){
        System.out.println("Name = "+name);
    }
    public String getName(){
        return name;
    }
//    public void setName(){
//        this.name=name;
//    }
}
