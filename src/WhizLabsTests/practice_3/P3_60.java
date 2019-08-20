package WhizLabsTests.practice_3;

public class P3_60 {

   int x = 10;

   /**
    * Below doesn't compile, because static content can't access instance content.
    */
//   static int y = x;

   P3_60() {
//      y++;
   }

   public static void main(String[] args) {
//      System.out.println(y + new P3_60().x);
   }
}
