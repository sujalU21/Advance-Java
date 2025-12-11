package JODOAPImeansDateAndTimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo4 {
    public static void main(String[] args) {

        LocalDate start = LocalDate.now();
        System.out.println(start);
        // to format the date or to chage the current format of a date
        // Correct pattern → "dd/MMM/yyyy"
        //DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MMM/yyyy");//28/Nov/2025
        //DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MMM/yyyy EEEE");//28/Nov/2025 Friday
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MMM/yyyy : E(e)");//28/Nov/2025 : Fri(5)
        System.out.println(start.format(format));
    }
}
