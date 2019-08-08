package WhizLabsTests.exceptions;

public class W8_3 {

   static Integer i;

   public static void main(String[] args) {

      try {
         System.out.println(i.doubleValue());

         /**
          * NullPointer exception is a subclass of Runtime Exception code
          * doesn't compile because of that. Commented out
          */
      } catch (/*NullPointerException | */ RuntimeException e) {
         System.out.println(e.getClass().getSimpleName());
      }
   }
}
