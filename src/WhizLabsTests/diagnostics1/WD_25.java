package WhizLabsTests.diagnostics1;

public class WD_25 {
   /**
    * Loop declarations
    */
   public static void main(String[] args) {
      for (int x = 10, y = 6; x > y; x--);
      for(int x =10, y = 6; x -- > y;);
      /**
       * Anything after for(;;); will not compile, as it is an unreachable statement.
       */
      // for(;;);
      for (int x = 10, y = 6; x > y; System.out.println(x--));
   }
}
