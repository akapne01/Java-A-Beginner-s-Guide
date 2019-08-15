package WhizLabsTests.practice_1;

import java.util.Arrays;

public class P1_5 {

   public static void main(String[] args) {
      String[] strings = {"N", "L", "n", "O", "S"};
      String[] strings2 = {"N", "L", "n", "O", "S", "1", "12", "9", "A", "A"};

      /**
       * Uses object version.
       * Looks like it is sorting based on ASCII values.
       * All objects should implement Comparable otherwise
       * will throw ClassCastException.
       * Sorts numbers before and upper case letters before
       * lower case.
       */
      Arrays.sort(strings);
      Arrays.sort(strings2);

      for (String s : strings) {
         System.out.print(s);
      }

      System.out.println();

      for (String s : strings2) {
         System.out.print(s);
      }
   }
}
