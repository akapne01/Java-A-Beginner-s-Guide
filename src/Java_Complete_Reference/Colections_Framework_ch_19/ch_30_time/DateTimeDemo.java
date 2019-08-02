package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * p. 1016
 * A simple example of LocalDate and LocalTime
 *
 * now() is a static factory method. These classes
 * don't have constructors.
 */
public class DateTimeDemo {
   public static void main(String[] args) {

      LocalDate curDate = LocalDate.now();
      System.out.println(curDate);

      LocalTime curTime = LocalTime.now();
      System.out.println(curTime);

      LocalDateTime curDateTime = LocalDateTime.now();
      System.out.println(curDateTime);

      LocalDate getDate = curDateTime.toLocalDate();
      System.out.println(getDate);

      LocalTime getTime = curDateTime.toLocalTime();
      System.out.println(getTime);
   }
}
