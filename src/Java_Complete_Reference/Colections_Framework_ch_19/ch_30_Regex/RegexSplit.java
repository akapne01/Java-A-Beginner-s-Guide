package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_Regex;

import java.util.regex.Pattern;

/**
 * p. 1002
 * Using split()
 */
public class RegexSplit {
   public static void main(String[] args) {
      // Match lowercase words
      Pattern pattern = Pattern.compile("[ ,.!]");

      String strs[] = pattern.split("one two, alpha9 12!done.");

      for (int i = 0; i < strs.length; i++) {
         System.out.println("Next token: " + strs[i]);
      }
   }
}
