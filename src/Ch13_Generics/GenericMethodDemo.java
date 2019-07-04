package Ch13_Generics;

/**
 * p. 469
 * Demonstrates generic methods
 */
public class GenericMethodDemo {

   /**
    * Type parameters declared before the return type.
    * Comparable is an interface declared in java.lang.
    * A class that implements comparable defines object
    * that can be ordered.
    * Requiring upper bound of Comparable ensures that
    * arraysEquals() can be used only with objects that
    * are capable of being compared.
    * @param x
    * @param y
    * @param <T>
    * @param <V>
    * @return
    */
   // Determine if the contents of 2 arrays are the same.
   static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
      // If lengths differ, they are not the same.
      if (x.length != y.length) {
         return false;
      }

      for (int i = 0; i < x.length; i++) {
         if (!x[i].equals(y[i])) {
            return false;
         }
      }

      return true;
   }

   public static void main(String[] args) {

      Integer nums[] = {1, 2, 3, 4, 5};
      Integer nums2[] = {1, 2, 3, 4, 5};
      Integer nums3[] = {1, 2, 7, 4, 5};
      Integer nums4[] = {1, 2, 7, 4, 5, 6};

      if (arraysEqual(nums, nums)) {
         System.out.println("nums equals nums");
      }

      if (arraysEqual(nums, nums2)) {
         System.out.println("nums equals nums2");
      }

      if (arraysEqual(nums, nums3)) {
         System.out.println("nums equals nums3");
      }

      if (arraysEqual(nums, nums4)) {
         System.out.println("nums equals nums4");
      }

      // Create an array of Doubles
      Double dvals[] = {1.1, 2.2, 3.3, 4.4, 5.5};
      /*
       * This won't compile because nums and dvals are
       * not the same type.
       */
//      if (arraysEqual(nums, dvals)) {
//         System.out.println("nums equals dvals");
//      }
   }
}
