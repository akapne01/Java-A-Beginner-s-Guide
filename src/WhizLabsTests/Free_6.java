package WhizLabsTests;

public class Free_6 {
   public static void main(String[] args) {
      try {
         Double number = Double.valueOf("120D");
      } catch (NumberFormatException ex) {
         System.out.println(ex);
      }

      /**
       * Variable number is defined inside the try block,
       * so it is out of scope on below line. It's scope
       * is only in the try block.
       */
//      System.out.println(number);
   }
}
