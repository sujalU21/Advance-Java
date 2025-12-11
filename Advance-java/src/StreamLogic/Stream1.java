package StreamLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {

        // Outer list of lists
        List<List<Integer>> l1 = new ArrayList<>();

        // First inner list
        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);

        // Second inner list
        List<Integer> l3 = new ArrayList<>();
        l3.add(100);
        l3.add(200);

        // Add inner lists to the outer list
        l1.add(l2);
        l1.add(l3);

        System.out.println("Original list of lists: " + l1);

        // Flatten the list of lists into a single list
        List<Integer> res = l1.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened list: " + res);
    }
}


// List<Objects> a1 = List.of(1,2,3,4,List.of(5,6,7));


//        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(10);
//        a1.add(90);
//        a1.add(45);
//
//        ArrayList<Integer> a2= new ArrayList<>();
//        a2.add(100);
//        a2.add(75);
//        a1.add(a2);



