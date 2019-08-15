package WhizLabsTests.diagnostics1;

public class WD_57 {

   public static void main(String[] args) {

      /**
       * Floating point values do not throw
       * AritmeticException when divided by
       * zero.
       * Result of d1 is NaN.
       *
       * There is a compile time error calling
       * .isNan method without any arguments as
       * it doesn't exist.
       *
       * Double has 2 isNan versions.
       *
       * Static one and non-static one.
       *
       * Static version is used below and requires
       * a double as an argument.
       *
       * Non Static version accepts no args and
       * returns boolean, but requires a Double
       * object reference to be called.
       */

      Double d1 = 0.0/0.0;

      System.out.println(d1);
//      System.out.println(Double.isNaN() + "");
      System.out.println(Double.isNaN(d1) + "");
      System.out.println(d1.isNaN() + "");
      System.out.println(d1.isInfinite());
   }
}
