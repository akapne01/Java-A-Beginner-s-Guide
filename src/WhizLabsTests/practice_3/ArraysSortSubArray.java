package WhizLabsTests.practice_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import static java.lang.Math.pow;

public class ArraysSortSubArray {
   /**
    * args can be put as final. If none provided then it is an
    * empty array.
    */
   public static void main(final String[] args) {
      // Our arr contains 8 elements
      int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
      //           0   1  2   3  4   5  6   7
      //               7, 6, 45, 21 index 5 is not included.
      // { 13, 6, 7, 21, 45, 9, 2, 100 }

      // Sort subarray from index 1 to 4, i.e.,
      // only sort subarray {7, 6, 45, 21} and
      // keep other elements as it is.
      short a9 = 89;

      /**
       * When args is not defined in command line, then it is an empty array.
       * It is not null.
       */
      System.out.println(Arrays.toString(args));
      /**
       * Whenever it sorts the subarray, it takes the array from index,
       * but to index is not included.
       */
      Arrays.sort(arr, 1, 5);

      System.out.printf("Modified arr[] : %s",
         Arrays.toString(arr));

      /**
       * Can sort arrays in reverse order using Collections, but
       * it will not accept array from primitives, it needs wrapper
       * class array instead.
       */
      Integer ai[] = {13, 7, 6, 45, 21, 9, 2, 100};
      Arrays.sort(ai, Collections.reverseOrder());
      System.out.println();
      System.out.printf("Modified arr[] : %s",
         Arrays.toString(ai));

      /**
       * Arrays.sort() vs Collections.sort()
       * Arrays.sort works also for primitive types.
       * Collections.sort works for collections of
       * objects and can't be used with primitives.
       * Collections.sort will also not accept Integer
       * array, it only accepts collections.
       */

//      Collections.sort(arr);
//      Collections.sort(ai);

      try {

      } catch (ArrayIndexOutOfBoundsException e) {

      } finally {

      }
      System.out.println("\n");
      System.out.println("Strings");
      System.out.println("ABA".indexOf("C"));
      System.out.println("ABA".lastIndexOf("C"));
      System.out.println("ABA".substring(-1, -1));

   }
}

abstract interface cucoou {


}
