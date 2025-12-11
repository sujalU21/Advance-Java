package org1Predicate.HigherOrderFunction;

import org1Predicate.Consumer;

import java.util.ArrayList;

public class Demo {
    public static <T> void forEach(ArrayList<T> obj, Consumer<T> c){
        for(T i:obj){
            c.accept(i);
        }
    }
}
