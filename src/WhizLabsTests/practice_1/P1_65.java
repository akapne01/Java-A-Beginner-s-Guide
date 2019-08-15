package WhizLabsTests.practice_1;

import java.time.LocalDate;

public class P1_65 {

   public static void main(String[] args) {

      /**
       * Prints out: 2015-12-29 : false
       * LocalDate class is immutable.
       * plus 2 weeks is not saved in variable,
       * so those changes will not be applied.
       * The original date gets printed.
       */
      LocalDate date = LocalDate.ofYearDay(2015, 363);
      date.plusWeeks(2); // redundant
      System.out.println(date + " : " + date.isLeapYear());
   }
}
