package WhizLabsTests.practice_2;

import java.util.*;

public class ArrBinarySearch {
   /**
    * Binary search finds elements in the sorted array.
    *
    * Static method
    * returns int value:
    *    index of key value if found
    *    if it is not found then -(insertion point - 1);
    * data type can be primitives or Object
    * Searches the specified array of the given data type.
    * Array must be sorted.
    * To sort array can use Arrays.sort() method
    * If array is not sorted then results are undefined.
    * If array contains multiple elements with specified
    * value, there is no guarantee on which of them will be find.
    */

   public static void main(String[] args) {
      int[] ba = {10, 20, 15, 22, 35};
      int a1 = Arrays.binarySearch(ba, 35);
      System.out.println(a1);

      char charArr[] = {'g','p','q','c','i'};
      a1 = Arrays.binarySearch(charArr, 'g');
      System.out.println(a1);

      int intArr[] = {10,20,15,22,35};
      System.out.println(Arrays.binarySearch(intArr, 22));

      double doubleArr[] = {10.2,15.1,2.2,3.5};
      System.out.println(Arrays.binarySearch(doubleArr, 1.5));

      int a3[] = new int[0];
      System.out.println(a3);
   }
}
