package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * p. 1020
 * Parse a date and a time
 */
public class ParseDateAndTime {
   public static void main(String[] args) {

      // Obtain a LocalDateTime object by parsing a date and time string.
      LocalDateTime curDateTime = LocalDateTime.parse("Aug 1, 2019 10:51 AM",
         DateTimeFormatter.ofPattern("MMM d',' YYYY h':'mm a"));

      // Now, display the parsed date and time.
      System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("MMM d',' YYYY h':'mm a")));
}
}
