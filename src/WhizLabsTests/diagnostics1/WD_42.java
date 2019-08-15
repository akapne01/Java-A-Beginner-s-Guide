package WhizLabsTests.diagnostics1;

public class WD_42 {
}

/**
 * If below methods would be non static, then C D would
 * be printed. But static methods are not inherited.
 * Whenever static method is called, it will correspond
 * to the reference type.
 */
class A {
   static void method() {
      System.out.println(" A B");
   }
}

class B extends A {
   protected static void method() {
      System.out.println(" C D");
   }
}

class Program {
   public static void main(String[] args) {
      A a = new B();
      a.method();
   }
}

