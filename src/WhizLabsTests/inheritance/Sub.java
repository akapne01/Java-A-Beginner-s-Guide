package WhizLabsTests.inheritance;


class Sup {
   protected void method() {
      System.out.println("Sup");
   }

   void print() {
      System.out.println("default");
   }
}

public class Sub extends Sup {
//   protected int method() { }

   /** Access modifier can be the same or broader when
    * overriding.
    */
   public final void method() {}

   public final void print() {}

}
