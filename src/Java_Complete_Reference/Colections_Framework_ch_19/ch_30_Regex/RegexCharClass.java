package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * p. 1001
 * Use a character class.
 */
public class RegexCharClass {
   public static void main(String[] args) {
      // Match lowercase words
      Pattern pattern = Pattern.compile("[a-z]+");
      Matcher matcher = pattern.matcher("this is a test");

      while (matcher.find()) {
         System.out.println("Match: " + matcher.group());
      }
   }
}
