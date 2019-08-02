package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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
   }
}
