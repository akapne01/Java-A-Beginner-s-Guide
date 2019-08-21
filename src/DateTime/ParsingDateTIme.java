package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDateTIme {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("02 15 2010", formatter);
        LocalTime time = LocalTime.parse("11:33");

        System.out.println(date);
        System.out.println(time);

        /**
         * Formatting date with formatter returns string representation
         * of the date
         */
        String text = date.format(formatter);
        System.out.println(text);

        /**
         * Throws DateTimeParseException
         */
//        LocalDate parsedDate2 = LocalDate.parse(text);
        LocalDate parsedDate = LocalDate.parse(text, formatter);

//        System.out.println(parsedDate2);
        System.out.println(parsedDate);

        LocalDate myDate = LocalDate.of(2010, Month.MAY, 5 );
        String dateString = formatter.format(myDate);
        System.out.println(dateString);

        LocalDate anotherDate = LocalDate.parse(dateString, formatter);
        anotherDate.plusMonths(5).plusDays(5); // result is ignored
        System.out.println(formatter.format(anotherDate));

        /**
         * Throws datetime exception, because there is no date 40 in the April
         */
//        LocalDate date2 = LocalDate.of(2020, Month.APRIL, 40);
//        LocalDate date2 = LocalDate.of(2020, 0, 1);
        LocalDate date2 = LocalDate.of(0, 1, 1);
        System.out.println(date2);

    }
}
