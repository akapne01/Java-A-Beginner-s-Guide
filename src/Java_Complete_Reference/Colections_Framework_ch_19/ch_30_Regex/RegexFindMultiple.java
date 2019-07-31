package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * p. 999
 * USe find() to find multiple subsequences.
 */
public class RegexFindMultiple {
   public static void main(String[] args) {
      Pattern pat = Pattern.compile("test"); // pattern to find
      Matcher mat = pat.matcher("test 1 2 3 test"); // where

      while (mat.find()) {
         System.out.println("test found at index " + mat.start());
      }

   }
}
