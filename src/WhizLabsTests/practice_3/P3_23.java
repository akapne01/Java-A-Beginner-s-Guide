package WhizLabsTests.practice_3;

public class P3_23 {

   /**
    * Final blocks are constant entities.
    * Has to be initialized at the declaration time,
    * otherwise doesn't compile.
    * Can be initialized in 3 ways:
    * 1) declaration
    * 2) constructor
    * 3) init block
    */
//   final int i;
   final int i1 = 100;
   final int i2;
   final int i3;
   {
      i3 = 300;
   }

   public P3_23() {
      this.i2 = 200;
   }

   public static void main(String[] args) {
      P3_23 s = new P3_23();
      System.out.println("i1 = " + s.i1);
      System.out.println("i2 = " + s.i2);
      System.out.println("i3 = " + s.i3);
   }
}
