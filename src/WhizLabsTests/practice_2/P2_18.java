package WhizLabsTests.practice_2;

public class P2_18 {
   static int x = 2;

   /**
    * Local variables can shadow the instance variable.
    * In this case, x is incremented to be 3.
    * After that new local variable x shadows the class
    * variable x. It's scope is only the if statement.
    * At the very end another local variable is created.
    * Since the x from the if statement is not in scope
    * anymore,the code compiles.
    */
   public static void main(String[] args) {

      if (x>1) {
         x ++;

         int x = 4;
         // this.x = 5; (xNC)
      }

      System.out.println(x);
      final int x = 10;
   }
}
