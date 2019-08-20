package WhizLabsTests.practice_2;

public class P2_2 {
   public static void main(String[] args) {
      /**
       * Initially this is 3x3 array.
       * Then the 0th row of this array is reassigned
       * to hold only 2 elements. So this array in total
       * can now hold 2 + 3 + 3 = 8 elements.
       */
      int nums[][] = new int[3][3];
      nums[0] = new int[2];
      for (int i[] : nums) {
         for (int j : i){
            System.out.print(j);
         }
         System.out.println();
      }
   }
}
