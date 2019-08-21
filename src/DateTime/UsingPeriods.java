package DateTime;

import java.time.*;

public class UsingPeriods {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        Period period = Period.ofWeeks(1);

        cleanAnimalCage(start, end);

        System.out.println(start.plus(period));

        System.out.println(LocalDateTime.now().plus(period));

        /**
         * Throws Unsupported Temporal Type Exception
         * Can't add days to time
         */
//        System.out.println(LocalTime.now().plus(period));

        Period yearAndMont = Period.ofYears(1).ofMonths(1);
        System.out.println(yearAndMont);

        cleanAnimalCage(start, end, period);

    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while(start.isBefore(end)) {
            System.out.println("Need to clean the cage on date = " + start);
            start = start.plusMonths(1);
        }
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        while(start.isBefore(end)) {
            System.out.println("Need to clean the cage on date = " + start);
            start = start.plus(period);
        }
    }
}
