package JODOAPImeansDateAndTimeApi;

import java.time.*;

public class Demo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.of(2025,11,30);
        System.out.println(localDate1);

        LocalTime localTime = LocalTime.now();
        System.out.println("Date = "+localTime);

        localTime = LocalTime.of(1,30);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //To get Time Zone / Zonal Time

        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println(tokyo);




    }
}
