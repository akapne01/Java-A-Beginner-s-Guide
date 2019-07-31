package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * p. 999
 * Use a quantifier.
 */
public class RegexQuantifier {
   public static void main(String[] args) {
      Pattern pattern = Pattern.compile("W+");
      Matcher matcher = pattern.matcher("W WW WWW");

      while (matcher.find()) {
         System.out.println("Match: " + matcher.group());
      }
   }
}
