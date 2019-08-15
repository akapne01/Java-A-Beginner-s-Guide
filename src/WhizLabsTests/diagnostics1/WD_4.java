package WhizLabsTests.diagnostics1;

public class WD_4 {
   public static void main(String[] args) {

      int []ints = new int[0b101];
      /**
       * 0b101
       * 1*1 + 0*2 + 1*4 = 1 + 4 = 5;
       */

      int len = ints.length;

      /**
       * Prints 00000. 5 times
       */
      for (int i : ints) {
         System.out.print(i);
      }
   }
}
