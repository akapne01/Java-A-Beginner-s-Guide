package WhizLabsTests;

import java.util.Arrays;

public class W3_6 {
   public static void main(String[] args) {

      /**
       * To index can be up to the length of array as it is
       * not inclusive.
       *
       * Sorts array from index 2 to index 5 inclusive
       * array length = 6 and to index = 6 ==> fine, exception thrown
       *
       * Sorted array:
       * 2, 5, 0, 3, 5, 9
       */
      int array[] = {2,5,9,5,0,3};
      Arrays.sort(array, 2,6);
      for (int i : array) {
         System.out.println(i);
      }
      // 0 + 9 => 9
      System.out.println("result " + (array[2] + array[5]));

      char ch = 'a';
      int arr[] = new int[ch];
      System.out.println("length is: " + arr.length);
//      new W3_6.met(In8);

      /** while(false) fails to compile */
//      while (false) {
//         System.out.println(1);
//      }

//

   }

   public String met(Number c) {
      int a = 9;
      class A {
         void print() {
            System.out.println(a);
         }
      }
      new A().print();
      return c.toString();
   }

   private class Aa {

   }

}
