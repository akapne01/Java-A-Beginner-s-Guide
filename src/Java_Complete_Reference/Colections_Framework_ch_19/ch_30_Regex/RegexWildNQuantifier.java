package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * p. 1000
 * Using wildcard and quantifier
 */
public class RegexWildNQuantifier {
   public static void main(String[] args) {

      /**
       * Begins with e and ends with d.
       * Result: extend cup end
       * It is the longest sequence that begins with e and ends with d.
       * This is called a greedy behaviour.
       * You can specify reluctant behaviour by adding ?
       */
      System.out.println("Greedy behaviour.");
      Pattern pattern = Pattern.compile("e.+d");
      Matcher matcher = pattern.matcher("extend cup end table");

      while (matcher.find()) {
         System.out.println("Match: " + matcher.group());
      }

      /**
       * Demonstrates reluctant behaviour
       */
      System.out.println("\nReluctant behaviour");
      pattern = Pattern.compile("e.+?d");
      matcher = pattern.matcher("extend cup end table");

      while (matcher.find()) {
         System.out.println("Match " + matcher.group());
      }
   }
}
