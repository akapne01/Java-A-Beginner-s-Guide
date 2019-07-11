package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

//import static java.lang; => (xNC)
import static OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.certification.Parent.*;

import java.lang.Integer; // Integer is not a static class, can't statically import it with this syntax.
import java.lang.Math;
import static java.lang.Integer.*; // This imports static memebers of the class

enum A {
   B(2), C(3), D(4);
   int n;
   A(int n) {
      this.n = n;
   }
}

public class _  extends Bar implements FooBar {
   static A a;

   public static void main(String[] args) {
      System.out.println(a.B.n);
      double n = Math.sqrt(9);
      System.out.println(n);

   }

   @Override
   public int bar() {
      return 0;
   }
}

class Bar {
   public static void main(String[] args) {
      System.out.println(Integer.MAX_VALUE);
   }

}

abstract class What extends _ implements FooBar {

}

interface FooBar {
   int bar();
   static void me() {

   }
}

