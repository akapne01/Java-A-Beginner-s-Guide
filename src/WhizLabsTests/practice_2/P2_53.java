package WhizLabsTests.practice_2;

public class P2_53 {
   public static void main(String[] args) {
      int array[] = {1, 2,  3};
      /**
       * Compilation fails for the below because we have defined
       * integer array, and are assigning it to the double array.
       * These types are not compatible, so the code fails to compile.
       */
//      double dbls[] = array;
//      double sum = 0;
//      for (int i = 0; i < array.length; ++i) {
//         sum += dbls[i];
//      }
//      System.out.println(sum);
   }
}
