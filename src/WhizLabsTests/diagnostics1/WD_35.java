package WhizLabsTests.diagnostics1;

public class WD_35 {

   public static void main(String[] args) {
      /**
       * Below compilation fails, because there are
       * no {} and if refers only to the first
       * System.out. So else has no if statement to
       * refer to.
       */

      int _6 = 6;

      if (_6 > 6) {
         System.out.println(">6");
      }
      System.out.println(" or ");
//      else {
         System.out.println("<6");
//      }
   }
}
