package DateTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormattingDateTime {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2010, Month.APRIL, 15);
        LocalTime time = LocalTime.of(11, 22, 33);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        /**
         * Short formatter prints 2 digits for year, medium prints 4 digits for the year.
         */

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(shortFormatter.format(dateTime));
        System.out.println(mediumFormatter.format(date));
//        System.out.println(shortFormatter.format(time)); // throws UnsupportedTemporalTypeException


        /**
         * Custom formats
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm:ss");
        System.out.println(dateTime.format(formatter));

        System.out.println("Before Java 8 - SimpleDateFormat");
        SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
        System.out.println(sf.format(new Date()));

        /** Exam tricks */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf.format(dateTime));
//        System.out.println(dtf.format(date)); // Throws exception as there is no time in the date
        System.out.println(dtf.format(time));

    }
}
