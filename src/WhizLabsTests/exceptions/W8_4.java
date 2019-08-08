package WhizLabsTests.exceptions;

public class W8_4 {
   public static void main(String[] args) {
      try {
         System.out.println(args[0]);
         /**
          * Exception object is final, value cannot be reassigned.
          */
      } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
         if (e instanceof ArrayIndexOutOfBoundsException) {
//            e = new ArrayIndexOutOfBoundsException("Out of bounds");
         } else if (e instanceof NullPointerException) {
//            e = new NullPointerException("Null Value");
         } else {
//            e = new ArithmeticException("Arithmetic")
         }

         System.out.println(e.getMessage());
      }
   }
}
