//package org2b20Nov2025;
//
//public class Employee {
//    int id;
//    String name;
//    double salary;
//
//    Employee (int id,String name, double salary){
//        this.id=id;
//        this.name=name;
//        //this.salary=salary;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public String toString() {
//        return id + " " + name + " " + salary;
//    }
//}


package org2b20Nov2025;

public class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;   // FIXED
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}
