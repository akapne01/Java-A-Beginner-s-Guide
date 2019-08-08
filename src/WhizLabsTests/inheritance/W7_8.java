package WhizLabsTests.inheritance;


class Ab {
   private final void print() {
      System.out.println("class Ab");
   }
}

class Sub2 extends Ab {
   private void print() {
      System.out.println("class Sub2");
   }
}


public class W7_8 {
   public static void main(String[] args) {
      Ab ab = new Sub2();
//      ab.print(); => xNC ab is a private method, not seen here
   }

}
