package Java_Complete_Reference.Colections_Framework_ch_19.ch_30_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * p. 1002
 * Use replaceAll()
 */
public class RegexReplaceAll {
   public static void main(String[] args) {

      String str = "Jon Jonathan Frank Ken Todd";

      Pattern pattern = Pattern.compile("Jon.*? ");
      Matcher matcher = pattern.matcher(str);

      System.out.println("Original sequence: " + str);

      str = matcher.replaceAll("Eric ");
      System.out.println("Modified sequence: " + str);
   }
}
