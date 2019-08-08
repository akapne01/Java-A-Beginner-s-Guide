package WhizLabsTests;

public class W4_1 {
   public static void main(String[] args) {

      /** metod(in) called without referring to an object.
       * In order for the code to compile, must be static.
        */
      Integer in = 10;
      System.out.println(method(in));
   }

   private static String method(Object c) {
      return c.toString();
   }
}
