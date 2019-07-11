package Ch14_Lambda_Expressions_Method_References;

/**
 * p 496.
 * Use the same functional interface with three different lambda expressions.
 */

/**
 * NumericTest is a functional interface that takes 2 parameters and returns boolean as
 * a result.
 */
interface NumericTest {
   boolean test(int n, int m);
}

public class LambdaDemo2 {
   public static void main(String[] args) {
      /**
       * This lambda expression determines if one number is a factor of another.
       */
      NumericTest isFactor = (n, d) -> (n % d) == 0;

      if (isFactor.test(10, 2)) {
         System.out.println("2 is a factor of 10.");
      }

      if (!isFactor.test(10, 3)) {
         System.out.println("3 is not factor of 10.");
      }
      System.out.println();

      /**
       * This lambda expression returns true if the first argument is less than the second.
       */
      NumericTest lessThan = (n, m) -> (n < m);

      if (lessThan.test(2, 10)) {
         System.out.println("2 is less than 10.");
      }

      if (!lessThan.test(10, 2)) {
         System.out.println("10 is not less than 2.");
      }
      System.out.println();

      /**
       * This lambda expression returns true if the absolute values of the arguments are equal.
       */
      NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

      if (absEqual.test(4, -4)) {
         System.out.println("Absolute values of 4 and -4 are equal.");
      }

      if (!lessThan.test(4, -5)) {
         System.out.println("Absolute values of 4 and -5 are not equal.");
      }
      System.out.println();
   }
}
