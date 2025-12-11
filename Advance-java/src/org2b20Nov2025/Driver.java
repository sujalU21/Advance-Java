package org2b20Nov2025;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        List<Object> result = Print.get(al, i -> i * i);
        System.out.println(result);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("A");
        al2.add("ab");
        al2.add("Aabc");
        al2.add("Awe");
        List<Object> result1 = Print.get(al2, x -> x.length());
        System.out.println(result1);

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "Raj", 50000));
        emp.add(new Employee(2, "Sita", 60000));

        System.out.println(Print.get(emp, e -> e.getSalary()));
        System.out.println(Print.get(emp, e -> e.getId() + " " + e.getName()));

        System.out.println(Print.get(emp, e -> {
            e.setSalary(e.getSalary() + 1000.0);
            return e;
        }));
    }
}
