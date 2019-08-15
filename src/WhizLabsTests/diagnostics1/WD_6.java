package WhizLabsTests.diagnostics1;

import java.util.Arrays;

public class WD_6 {
   public static void main(String[] args) {
      String [][] strings = {{"A", "Z"}, {"C", "D", "S"}, {"L"}};

      /**
       * Arrays.sort(strings) throws ClassCastException, String array cannot be
       * cast to Comparable.
       * Arrays.sort() can be used for 1 dimensional arrays, but not for 2 dimensional.
       *
       * CLASS CAST EXCEPTION
       */
      Arrays.sort(strings);

      for(String []str : strings) {
         for(String s : str) {
            System.out.println(s);
         }
      }
   }
}
