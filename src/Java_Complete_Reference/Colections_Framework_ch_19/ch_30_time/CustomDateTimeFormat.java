package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * p. 1019
 * Create a custom date and time format.
 */
public class CustomDateTimeFormat {
   public static void main(String[] args) {

      LocalDateTime curDateTime = LocalDateTime.now();
      System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("MMM d',' YYYY h':'mm a")));
   }
}
