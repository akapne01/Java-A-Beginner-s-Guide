package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * p. 998
 * A simple pattern matching demo
 */
public class Regexpr {

   public static void main(String[] args) {
      Pattern pat;
      Matcher mat;
      boolean found;

      pat = Pattern.compile("Java");
      mat = pat.matcher("Java");
      found = mat.matches(); // check for the match

      System.out.println("Testing Java against Java.");
      if (found) {
         System.out.println("Matches");
      } else {
         System.out.println("No match");
      }

      System.out.println();

      System.out.println("Testing Java against Java SE.");
      mat = pat.matcher("Java SE");

      found = mat.matches();

      if (found) {
         System.out.println("Matches");
      } else {
         System.out.println("No match");
      }
   }
}
