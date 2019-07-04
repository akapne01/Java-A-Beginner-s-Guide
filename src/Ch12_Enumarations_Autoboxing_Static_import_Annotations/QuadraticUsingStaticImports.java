package Ch12_Enumarations_Autoboxing_Static_import_Annotations;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

/**
 * p. 444
 * Use static imports to bring sqrt(), and pow() into view.
 * Solves equation 4x^2 + x - 3 = 0
 */

public class QuadraticUsingStaticImports {
   public static void main(String[] args) {
      double a, b, c, x;
      a = 4;
      b = 1;
      c = -3;

      // Find first solution
      x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
      System.out.println("First solution is: " + x);

      // FInd second solution
      x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
      System.out.println("First solution is: " + x);
   }
}
