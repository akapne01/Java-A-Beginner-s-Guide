package WhizLabsTests.one;

import WhizLabsTests.whiz.A;

public class W4_3 extends A {

   public static void main(String[] args) {
      W4_3 wh = new W4_3();
      wh.print(5);
      System.out.println(wh.x);
      wh.print2();
      System.out.println(wh instanceof W4_3);

   }

   /**
    * A is in the different package and it's variable x has a protected access.
    * This means when we make instance of A and call a.x to access variable, it
    * is not seen from this package. The only way how we can access it is through
    * object of this class that is extending A, either in instance methods, or
    * new W4_3().x
    */
   public void print(int x) {
      A a = new A();
//      System.out.println(a.x);

   }

   public void print2() {
      System.out.println(x);
   }
}

interface Face {
   int x = 9;
   default void name() {

   }
}
