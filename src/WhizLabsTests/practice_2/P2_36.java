package WhizLabsTests.practice_2;

public class P2_36 {

   /**
    * prints 12, 13 and then ArrayOutOfBoundException
    * It initializes x to 0, then increments to 1, then prints
    * out, increments again and prints. The last time it is
    * index 3, but it only goes up to 2 as it has 3 elements so
    * array out of bounds exception is printed.
    */
   public static void main(String[] args) {
      new P2_36().iterator(new int[]{10, 12, 13});
   }

   void iterator(int[] i) {
      for (int x = 0; x < i.length; System.out.print(i[x] + " ")) {
         x++;
      }
   }
}
