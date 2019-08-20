package WhizLabsTests.practice_2;

public class P2_19 {

   static int x = 2;
   static int z;

   public static void main(String[] args) {
      System.out.println("x from main: " + x);
      System.out.println("z from main: " + z);
      System.out.println(x + z);
   }

   /**
    * Variable x here is only in scope in the static block, but it not in the scope
    * for the whole class.
    */
   static {
      int x = 3;
      z = x;
//      P2_19.x = x; This line would assign 3 to the static variable 2.
      System.out.println("x from static block is: " + x);
      System.out.println("z from static block is: " + z);
   }
}
