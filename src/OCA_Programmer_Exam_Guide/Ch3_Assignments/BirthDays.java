package OCA_Programmer_Exam_Guide.Ch3_Assignments;

// p. 199

import java.util.Arrays;

/**
 * Array values are automatically initialized to the default values as well.
 * In below example, integer array is created with 100 elements, but it is
 * not initialized. When array is printed out, it has all values as 0.
 */

public class BirthDays {

   static int[] year = new int[100];

   public static void main(String[] args) {
      for (int i = 0; i < 100; i++) {
         System.out.println("year[" + i + "] = " + year[i]);
      }

      System.out.println(Arrays.toString(year));
   }

   ;
}
