package WhizLabsTests.diagnostics1;

public class WD_51 {
   public static void main(String[] args) {

      /**
       * A2.x produces compile time error.
       * It is illegal to access instance variables using the
       * class name. They can only be accessed through valid
       * object reference.
       */
      A2 ab = new B2();
      System.out.println(ab.x);
      System.out.println(B2.j);
      System.out.println(ab.j);
//      System.out.println(A2.x);
      System.out.println(A2.j);
   }

}

class A2 {
   protected int x = 10;
   static int j = 21;
}

class B2 extends A2 {
}

