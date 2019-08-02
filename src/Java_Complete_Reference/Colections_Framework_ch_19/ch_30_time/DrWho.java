package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_time;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit; // not on exam

/**
 * p. 360
 * OCA book.
 * Accepts commandline argument in the form mmddyyy.
 * The one currently entered is 01201934.
 * DateFormater object is used to parse the user entered
 * first argument and verify that it is a valid date of the
 * form we need.
 *
 * Print out the verified date, day of the week.
 *
 * Next period object is created => represents the amount of time
 * between the users birthday and now.
 *
 * until() with uint of DAY is used to determine how many days the
 * user has been alive.
 *
 * Then we add 30,000 days to the user's birthday so we can calculate on
 * which day user will be have lived 30,000 days.
 *
 * Then common factory method of() is used to create another date object
 * that represents today's date. Use it in conjunction with very powerful
 * between() method to see how long it's been since January 1, 2000, Y2K.
 *
 */
public class DrWho {
   public static void main(String[] args) {

      /** Describe a format */
      DateTimeFormatter f = DateTimeFormatter.ofPattern("MMddyyyy");
      LocalDate bday = null;

      try {
         /** Verify input date often parse() methods throw exceptions */
         bday = LocalDate.parse(args[0], f);
      } catch (java.time.DateTimeException e) {
         System.out.println("bad dates Indy");
         System.exit(0);
      }

      System.out.println("your birthday is: " + bday);
      /** Gets day of the week */
      System.out.println("a " + bday.getDayOfWeek());

      /**
       * Period result: P85Y6M12D
       * P stands for period
       * 85Y => 85 years
       * 6M => 6 months
       * 12D => 12 days
       */
      Period p1 = Period.between(bday, LocalDate.now());
      System.out.println("Period p1: " + p1);
      System.out.println("You've lived for : ");
      System.out.println(p1.getDays() + " days, ");
      System.out.println(p1.getMonths() + " months, ");
      System.out.println(p1.getYears() + " years");

      int yearsOld = p1.getYears();

      if (yearsOld < 0 || yearsOld > 119) {
         System.out.println("Wow, are you a time lord?");
      }

      long tDays = bday.until(LocalDate.now(), ChronoUnit.DAYS);

      System.out.println("you've lived for " + tDays + " days, so far");

      System.out.println("you'll reach 30,000 days on " + bday.plusDays(30_000));

      /** of() is commonly used factory method */
      LocalDate d2000 = LocalDate.of(2_000, 1, 1);

      Period p2 = Period.between(d2000, LocalDate.now());

      System.out.println("period since Y2K: " + p2);
   }
}
