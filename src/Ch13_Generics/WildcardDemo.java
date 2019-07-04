package Ch13_Generics;

/**
 * p. 465
 * Demonstrate wildcard ? for generic types.
 * Have added absEquals() method to NumericFunctions class
 * that implements NumericFunctions<?> object.
 */

public class WildcardDemo {
   public static void main(String[] args) {

      NumericFunctions<Integer> iOb = new NumericFunctions<Integer>(6);
      NumericFunctions<Double> dOb = new NumericFunctions<Double>(-6.0);
      NumericFunctions<Long> lOb = new NumericFunctions<Long>(5L);

      System.out.println("Testing iOb and dOb.");
      if (iOb.absEquals(dOb)) {
         System.out.println("Absolute values are equal.");
      } else {
         System.out.println("Absolute values differ.");
      }

      System.out.println();

      System.out.println("Testing iOb and lOb.");
      if (iOb.absEquals(lOb)) {
         System.out.println("Absolute values are equal.");
      } else {
         System.out.println("Absolute values differ.");
      }
   }
}
