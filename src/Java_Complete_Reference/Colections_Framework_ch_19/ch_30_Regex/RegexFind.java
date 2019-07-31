package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * p. 998
 * Use find() to fins subsequence.
 */
public class RegexFind {
   public static void main(String[] args) {

      Pattern pat = Pattern.compile("Java");
      Matcher mat = pat.matcher("Java SE");

      System.out.println("Looking for Java in Java SE");

      if (mat.find()) {
         System.out.println("Subsequence found.");
      } else {
         System.out.println("No match.");
      }
   }
}
