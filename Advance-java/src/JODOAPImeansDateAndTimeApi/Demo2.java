package JODOAPImeansDateAndTimeApi;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Demo2 {
    public static void main(String[] args) {
        LocalDate localDate= LocalDate.of(2025,12,15);
        LocalDate todayDate = LocalDate.now();

        // for comparing the date we have IsAfter(obj)
        System.out.println(localDate.isAfter(todayDate));

        // for comparing the date we have IsAfter(obj)
        System.out.println(localDate.isBefore(todayDate));

        LocalDate start = LocalDate.of(2025,1,1);
        LocalDate expiryDate = LocalDate.of(2026,1,1);
        LocalDate today = LocalDate.now();

        if(expiryDate.isBefore(today)){
            System.out.println("Invalid");
        }

        else {
            System.out.println("Valid");
        }

        // Reameaming Day between the date
        Period leftDate = Period.between(today,expiryDate);
        System.out.println(leftDate);
        System.out.println(leftDate.getDays()+" Days ");
        System.out.println(leftDate.getMonths()+" Months ");
        System.out.println(leftDate.getYears()+" Years ");

        long monthleftA= ChronoUnit.MONTHS.between(today,expiryDate);
        System.out.println("Months left = "+monthleftA);

        long dayleftB= ChronoUnit.DAYS.between(today,expiryDate);
        System.out.println("Days left = "+dayleftB);


    }


}
