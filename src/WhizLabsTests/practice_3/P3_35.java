package WhizLabsTests.practice_3;

public class P3_35 {
   public static void main(String[] args) {
      final int s = 2;

      /**
       * Private access modifier cannot be used with local
       * variables!!!!
       *
       * Only final modifier can be used with local variables!!!
       */
//      private final int x = 3;
      final int x = 3;

      switch(s) {
         case 1 :
            System.out.println("A");break;
         case x-1:
            System.out.println("B");
         case x:
            System.out.println("C");break;
         case x + 3:
            System.out.println("D");break;
         default:
            System.out.println("F");
      }
   }
}
