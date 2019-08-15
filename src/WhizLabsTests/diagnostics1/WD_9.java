package WhizLabsTests.diagnostics1;

public class WD_9 {

   static Integer I;

   public static void main(String[] args) {

      /**
       * NullPointerException is generated when we try to invoke toString method on static
       * variable I. There is no catch clause to catch it, it has only finally clause.
       * There os another try clause in the finally, doesn't generate exception.
       * It goes to its finally and prints Fin2.
       * After that Fin1 is printed as no exception generated inside the try.
       * NullPointerException remains uncaught, it will be thrown at the end.
       */
      String s;

      try {
         System.out.println("I = " + I);
         s = I.toString();
      } finally {
         try {
            int i = Integer.parseInt(args[0]);
         } catch (NumberFormatException E) {
            System.out.println("Number Format");
         } finally {
            System.out.print("Fin2 ");
         }

         System.out.print("Fin1");
      }
   }
}
