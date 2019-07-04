package Ch12_Enumarations_Autoboxing_Static_import_Annotations;

/**
 * p. 443
 * Find the solutions of quadrartic equation without static imports.
 */

public class QuadraticWithoutStaticImport {
   public static void main(String[] args) {
      /*
       * a, b, c represent the coefficients in the
       * quadratic equation:
       * ax^2 + bx + c = 0
       */
      double a, b, c, x;

      // Solve 4x^2 + x - 3 = 0
      a = 4;
      b = 1;
      c = -3;

      // Find the first solution
      x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
      System.out.println("First solution: " + x);

      // Find second solution
      x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
      System.out.println("First solution: " + x);
   }
}
