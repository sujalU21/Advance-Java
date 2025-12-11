package JODOAPImeansDateAndTimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo6 {
    public static void main(String[] args) {
        String start  = "" +
                "" +
                "" +
                "" +
                "" +
                "25/11/2025";
        String end = "01/01/2026";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate= LocalDate.parse(start,formatter);
        LocalDate endDate = LocalDate.parse(end ,formatter);
        System.out.println(startDate);
        System.out.println(endDate);

    }
}

//package JODOAPImeansDateAndTimeApi;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//public class Demo6 {
//    public static void main(String[] args) {
//
//        String start  = "25/11/2025";
//        String end = "01/01/2026";
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
//
//        LocalDate startDate = LocalDate.parse(start.trim(), formatter);
//        LocalDate endDate = LocalDate.parse(end.trim(), formatter);
//
//        System.out.println(startDate);
//        System.out.println(endDate);
//    }
//}

