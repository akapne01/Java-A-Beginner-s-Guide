package OCA_Programmer_Exam_Guide.Ch6_Strings_Arrays_Lists_Dates_Lamndas;

import java.util.function.Predicate;

/**
 * p. 395
 */
public class Lammbdas2 {
   public static void main(String[] args) {

      Lammbdas2 m1 = new Lammbdas2();

      /** Legal Lambdas */
      m1.go(x -> 7 < 5);
      m1.go(x -> {return adder(2, 1) > 5;});
      m1.go((Lammbdas2 x) -> { int y = 5; return adder(y, 7) > 8;});
      m1.go(x -> { int y = 5; return adder(y, 6) > 8;});
      int a = 5; int b = 6;
      m1.go(x -> {return adder(a, b) > 8;});
      m1.go((Lammbdas2 x) -> adder(a, b) > 13);

      /** Illegal Lambdas */
//      m1.go(x -> return adder(2,1) > 5; ); => Can't have return statement without block
//      m1. go(()-> adder(2, 3) > 7); => Predicates needs 1 argument
//      m1. go(x-> {adder(4,2) >9}); // => Block needs statements -> return and ;
//      m1.go(x -> {int y=5; adder(y, 7) > 8;}); // => Block needs return
   }

   void go(Predicate<Lammbdas2> e) {
      Lammbdas2 m2 = new Lammbdas2();
      System.out.println(e.test(m2) ? "ternary true" : "ternary false");
   }

   static int adder(int x, int y) {
      return x + y;
   }
}
