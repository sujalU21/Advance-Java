package JODOAPImeansDateAndTimeApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo5 {
    public static void main(String[] args) {
        LocalDateTime local = LocalDateTime.now();
        System.out.println(local);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm");
        System.out.println(local.format(formatter));//28/11/2025 13:54
    }
}
