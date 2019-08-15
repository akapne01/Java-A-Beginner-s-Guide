package WhizLabsTests.diagnostics1;

/**
 * Compilation error in calc return statement.
 * It is illegal to access non-static variables
 * from static context.
 */
public class WD_61 {

   final int j = 32;

   public static void main(String[] args) {

      char c = 'A';
//      System.out.println((char)calc(c));
   }

//   static int calc(int i) {
//      return (i + j);
//   }


}
