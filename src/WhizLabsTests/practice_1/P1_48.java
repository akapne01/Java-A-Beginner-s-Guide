package WhizLabsTests.practice_1;

public class P1_48 {

   static int x =10;

   public static void main(String[] args) {

      P1_48 wh = new P1_48();
      wh.x = 5;
      int y = x / wh.x;
      System.out.print("y =");

      /**
       * System.out.print() can't be left empty.
       * It does not make sense as it would not
       * so anything is left empty.
       * Println makes sense as it is printing out
       * an empty line.
       */
//      System.out.print();
      System.out.print(y);
   }

}
