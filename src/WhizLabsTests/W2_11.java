package WhizLabsTests;

/**
 * If there is an if statement initializing local variable, then there is a 50%
 * chance that variable is not initialized. Because of this, compiler is complaining
 * and will not let to run the code even if the if statement is true.
 *
 * However, when if(true) is used, in that case it will compile fine.
 */
public class W2_11 {
   int j =10;

   public static void main(String[] args) {
      int j;
      if (new W2_11().go(10)) j = 5;
//      System.out.println(j);

      if (true) j = 5;
      System.out.println(j);

      double aDouble = 1.2;
      double bDouble = 1.2D;
      System.out.println(aDouble == bDouble);
   }

   boolean go(int y) {
      if (y>5) return true;
      else return false;
   }

}
