package WhizLabsTests.diagnostics1;

public class WD_27 {

   static int x = 1;

   public static void main(String[] args) {

      int[] nums = {0,1,2,3,4};

      for(int x: nums) {
         System.out.println(x);
         continue;

         /**
          * Below line does not compile as unreachable statements.
          */
//         System.out.println(x + WD_27.x);
      }
   }
}
