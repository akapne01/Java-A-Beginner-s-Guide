package OCA_Programmer_Exam_Guide.Ch6_Strings_Arrays_Lists_Dates_Lamndas;

/**
 * p. 374
 * Just in time anonymous array.
 */
public class JIT {
   void takesAnArray(int[] someArray) {
      for (int s:someArray) {
         System.out.println(s);
      }
   }

   public static void main(String[] args) {
      JIT j = new JIT();
      j.takesAnArray(new int[]{7, 7, 8, 2, 5});

      System.out.println();
      j.takesAnArray(new int[]{7, 7, 8, 2, 5});
   }
}
