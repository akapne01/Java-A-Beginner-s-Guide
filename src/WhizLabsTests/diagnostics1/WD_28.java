package WhizLabsTests.diagnostics1;

public class WD_28 {
   public static void main(String[] args) {

      int x = 20;

      while(x > 0) {
         /**
          * Runs 2x
          * Do runs 1st time until x = 4. Then x is decremented to 3 below.
          * 2nd time 3 - 2 => x becomes 1 in the do loop as it is guaranteed
          * to be executed at least 1x.
          * Then x is decremented form 1 to 0. At this point while loop condition
          * is false, so it breaks out.
          * Prints 30.
          */

         do {
            /**
             * runs:
             * 18, 16, 14, 12, 10, 8, 6, 4.
             * x > 5 => False, so breaks
             */
            x -= 2;
            System.out.println("x inside do: = " + x);
         } while (x > 5);
         System.out.println("x before : " + x);
         /**
          * 1st time decrement: 4 -> 3
          */
         x--;
         System.out.println("X after decremented");
         System.out.print(x);
      }
   }
}
