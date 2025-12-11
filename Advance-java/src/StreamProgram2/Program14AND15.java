package StreamProgram2;
import java.util.ArrayList;
import java.util.Comparator;

public class Program14AND15 {

        public static void main(String[] args){
            ArrayList<Integer> a1 = new ArrayList<>();
            a1.add(102);
            a1.add(1);
            a1.add(32);
            a1.add(41);
//            int max= a1.stream().max(Comparator.naturalOrder()).get();
//            System.out.println("MAX = "+max);
//            int min= a1.stream().min(Comparator.naturalOrder()).get();
//            System.out.println("MIN = "+min);

            int min = a1.stream().mapToInt(i -> i).min().getAsInt();
            System.out.println("MIN = "+min);

            int max = a1.stream().mapToInt(i -> i).max().getAsInt();
            System.out.println("MAX = "+max);



        }
    }

//            List<String> a1 = new ArrayList<>();
//            a1.add("Ram");
//            a1.add("Shyam");
//            a1.add("Mohan");
//            a1.add("Ram");
//
//            a1.stream().filter(i->i.startsWith("R")).limit(1).forEach(System.out::println);
