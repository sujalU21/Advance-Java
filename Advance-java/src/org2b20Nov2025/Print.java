//package org2b20Nov2025;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Print {
//    public static <T,R> List<R> get(ArrayList<T> li , Function<T,R> func){
//        ArrayList<R> result = new ArrayList<>();
//        for(T i : li){
//           R j = func.apply(i);
//           result.add(j);
//        }
//    return null;
//    }
//}


package org2b20Nov2025;

import java.util.ArrayList;
import java.util.List;

public class Print {
    public static <T, R> List<R> get(List<T> li, Function<T, R> func){
        ArrayList<R> result = new ArrayList<>();

        for (T i : li) {
            R j = func.apply(i);
            result.add(j);
        }

        return result;   // FIXED
    }
}
