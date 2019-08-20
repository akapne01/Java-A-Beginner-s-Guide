package WhizLabsTests.practice_3;

import java.util.Arrays;

public class ArraysTest {
   public static void main(String[] args) {
      System.out.println(args.length);
      int[][] a1 = new int[5][];
      System.out.println(a1.length);
      System.out.println(a1[0]);
      /**
       * After : int[][] a1 = new int[5][];
       * We have 1 dimensional array with 5 rows.
       * Each row is initialized to null
       * a1[0] = null
       * a1[1] = null
       * a1[3] = null
       * a1[4] = null
       */

      a1[3] = new int[6];
      System.out.println(Arrays.toString(a1));
      /**
       * After  a1[3] = new int[6];
       * array becomes: [null, null, null, [I@610455d6, null]
       * and a1[3] is an array  the is : [0, 0, 0, 0, 0, 0]
       */
      System.out.println(Arrays.toString(a1[3]));

      Arrays.sort(a1[3]);

      long a = 0xB; // can't be  used to init Array
      Long al = 0xBl; // is not compiling without l. Is then considered to be int.

      // Byte can be used to initialize array. Byte can be promoted to int
      byte b = 6;
      Byte bb = 6;

      // Chars are fine to be used to initialize array.
      char c = 9;
      char c2 = 'a'; // 97
      Character cc = 9;
      Character cc2 = 'a'; // 97

      /**
       * When primitive long is casted to int, code compiles.
       * When primitive long is casted to Integer, code does not compile.
       * When wrapper long is casted to Integer, code doesn't compile.
       * When wrapper long is casted to int, code doesn't compile.
       */
      int[] a2 = new int[cc2];
      System.out.println(a2.length);


      /** Arrays.sort */
      int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

      Arrays.sort(arr);

      System.out.printf("Modified arr[] : %s", Arrays.toString(arr));

      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            if (j == 2) continue;
            if (j == 2) break;
         }
      }
      StringBuilder sb = new StringBuilder("a");
      String aaa;

   }
}
