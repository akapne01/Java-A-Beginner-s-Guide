package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * p. 362 OCA book
 * Date formatting
 */
public class NiceDates {
   public static void main(String[] args) {

      DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
      DateTimeFormatter f2 = DateTimeFormatter.ofPattern("E MMM dd, yyyy G");
      DateTimeFormatter tf1 = DateTimeFormatter.ofPattern("k:m:s A a");

      LocalDate d = LocalDate.now();
      String s = d.format(f1);

      System.out.println(s);
      System.out.println(d.format(f2));

      LocalTime t = LocalTime.now();
      System.out.println(t.format(tf1));

      int[] arr = {1,2,3,};
      System.out.println(arr.length);
   }
}
