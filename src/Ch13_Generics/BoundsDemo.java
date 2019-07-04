package Ch13_Generics;

/**
 * p. 461
 * Type argument for T must be either number or a class
 * derived form number.
 * Number is inclusive upper limit.
 * This ensures that only Numbers can be passed in as
 * generic types and no other types are allowed.
 */

class NumericFunctions<T extends Number> {
   T num;

   // Pass the constructor a reference to a numeric object
   NumericFunctions(T n) {
      num = n;
   }

   // Return reciprocal
   double reciprocal() {
      return 1 / num.doubleValue();
   }

   // Return the fractional component
   double fraction() {
      return num.doubleValue() - num.intValue();
   }

   // Determine if absolute values of 2 objects are the same.
   boolean absEquals(NumericFunctions<?> ob) {
      if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
         return true;
      }
      return false;
   }
}

public class BoundsDemo {
   public static void main(String[] args) {

      NumericFunctions<Integer> iOb = new NumericFunctions<>(5);
      System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
      System.out.println("Fractional component of iOb is " + iOb.fraction());
      System.out.println();

      NumericFunctions<Double> dOb = new NumericFunctions<>(5.25);
      System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
      System.out.println("Fractional component of dOb is " + dOb.fraction());
      System.out.println();

      /*
       * String doesn't compile, because it is not a subclass of Number.
       */
      // NumericFunctions<String> strObj = new NumericFunctions<String>("Error");
   }
}
