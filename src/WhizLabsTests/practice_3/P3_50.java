package WhizLabsTests.practice_3;

public class P3_50 {
   public static void main(String[] args) throws Exception {
      /**
       * Check method accepts short, but 10 is int.
       * It is ok to assign 10 to short variable, and then
       * pass the variable s to the method and code will compile
       * normally.
       */
      short s = 10;
      System.out.println(new P3_50().check(10));
      long a = 4;
      long ab = 9l;

   }

   boolean check(double x){
      if (x<10) return true;
      else return false;
   }

}
