package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.function.Predicate;

/**
 * p. 1018
 * Demonstrate date time formatter.
 */
public class DateTimeFormatterDemo {
   public static void main(String[] args) {

      LocalDate curDate = LocalDate.now();
      System.out.println(curDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

      LocalTime curTime = LocalTime.now();
      System.out.println(curTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));

      LocalDate date = LocalDate.parse("2020-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
      date.plusDays(2);
      System.out.println(date);
//      date.plusHours(3);
      System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
      // Throws DateTimeException
//      LocalDate date2 = LocalDate.of(2020, Month.APRIL, 40);
      LocalDate date2 = LocalDate.of(2020, Month.APRIL, 30);
      date2 = date2.plusDays(3);
      System.out.println(date2);
      Period p = Period.of(1, 2, 3);
      DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
   }
}
