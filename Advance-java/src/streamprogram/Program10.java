package streamprogram;

import java.util.ArrayList;
import java.util.List;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(102);
        a1.add(null);
        a1.add(32);
        a1.add(41);

        List<Integer> res = a1.stream().filter(n->n!=null).toList();
        System.out.println(res);
        //[102, 32, 41]
    }
    }
