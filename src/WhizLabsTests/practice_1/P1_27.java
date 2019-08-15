package WhizLabsTests.practice_1;

public class P1_27 {

   public static void main(String[] args) {

      int y = 5;

      if(false && y++==11)
         System.out.println(y);
      else if (true || --y == 4)
         System.out.println(y);

      /**
       * Else statement can't have any ().
       */
//      else (y==5) {
//
//      }
   }
}
