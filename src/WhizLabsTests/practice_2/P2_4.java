package WhizLabsTests.practice_2;

public class P2_4 {
   public static void main(String[] args) {

      final int []ints = new int[3];
      int length = ints.length;
      /**
       * ints[1]++ is equals to:
       * ints[1] = ints[1] + 1;
       * ints[1] += 1;
       */
      ints[1]++;
      ints[1] += 1;
      ints[1] = ints[1] + 1;

      for (int i : ints) {
         System.out.print(i);
      }
   }
}
