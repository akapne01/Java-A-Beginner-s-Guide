package WhizLabsTests.diagnostics1;

import java.util.Arrays;

public class WD_66 {

   public static void main(String[] args) {
      String []x = {"A", "B", "C", "D", "E"};
      System.out.println(Arrays.toString(x));

      nxt(x);
      System.out.println(Arrays.toString(x));
      for (String s : x) {
         System.out.print(s + " ");
      }
   }

   /**
    * x and y refer to the same object
    */
   static void nxt(Object o) {
      String [] y = (String []) o;
      for (int i = 5, j = 0; i > 0; --i, j++) {
         y[j] = Integer.toString(i);
      }
   }
}
