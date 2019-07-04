package Ch13_Generics;

/**
 * p. 471
 * A constructor can be generic even if the class is not generic.
 */

class Summation {
   private int sum;

   <T extends Number> Summation(T arg) {
      sum = 0;

      // No matter which number class is called, the
      // int.Value() converts it to int.
      for (int i = 0; i <= arg.intValue(); i++) {
         sum += i;
      }
   }

   int getSum() {
      return sum;
   }
}

public class GenericConstructorDemo {
   public static void main(String[] args) {

      Summation ob = new Summation(4.0);
      System.out.println("Summation of 4.0 is " + ob.getSum());

      Summation ob2 = new Summation(4.2);
      System.out.println("Summation of 4.2 is " + ob2.getSum());

   }
}
