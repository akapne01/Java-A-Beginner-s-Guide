package WhizLabsTests.diagnostics1;

public class WD_30 {

   public static void main(String[] args) {

      /**
       * Compilation fails for the below program, because
       * after first if statement there is a ; that is
       * terminating the 1st if statement.
       * There is sout statement in the middle so else if
       * is not referring to the if.
       */
      int x = 10;

      if (x > 10) {
         ;
      }
      System.out.println(">");
//      else if (x < 10) {
      System.out.println("<");
   }
}
