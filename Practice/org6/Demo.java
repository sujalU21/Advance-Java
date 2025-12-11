package org6;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Company company = new Company("YouTube");
        System.out.println(company.getName());

        Field field = Company.class.getDeclaredField("name");

        field.setAccessible(true);
        field.set(company,"Google");
        System.out.println(company.getName());

        //Private method
        Method method = Company.class.getDeclaredMethod("display");
        method.setAccessible(true);
        method.invoke(company);
    }
}
