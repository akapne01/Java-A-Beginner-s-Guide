package WhizLabsTests;

import java.util.Arrays;

public class Free_19 {

   static Integer i;


   public static void main(String[] args) {

      final int kkk;
      kkk = 9;
      StringBuilder sb = new StringBuilder("1Z0");
      /**
       * Below line does not compile, because
       * StringBuilder doesn't have method concat.
       */
//      sb.concat("-808");
      System.out.println(sb);
      int []a = {0123};
      int []b = new int[0b101];

      System.out.println(i);

      /**
       * ClassCastException is thrown as arrays cannot be compared to strings.
       */
      String[] d2[] = {{"c", "d"}, {"a", "b"}};
//      Arrays.sort(d2);
//      System.out.println(Arrays.toString(d2));
   }
}
