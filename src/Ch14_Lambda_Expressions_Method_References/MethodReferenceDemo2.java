/**
 * p. 512
 * Use a reference to an instance method.
 */

package Ch14_Lambda_Expressions_Method_References;

/**
 * This class stores an int value ad defines the instance method isFactor(),
 * which returns true if ths argument is a factor of the stored value.
 */
class MyIntNum {

   private int v;

   MyIntNum(int x) {
      v = x;
   }

   int getNum() {
      return v;
   }

   /**
    * Return true if n is a factor of v.
    */
   boolean isFactor(int n) {
      return (v % n) == 0;
   }
}

public class MethodReferenceDemo2 {
   public static void main(String[] args) {

      boolean result;

      MyIntNum myIntNum = new MyIntNum(12);
      MyIntNum myIntNum2 = new MyIntNum(16);

      /**
       * Here, a method reference to isFactor on myNum is created.
       */
      IntPredicate ip = myIntNum::isFactor;

      /**
       * Now, it is used to call isFsctor() via test().
       */
      result = ip.test(3);
      if (result) {
         System.out.println("3 is a factor of " + myIntNum.getNum());
      }

      /**
       * This time, a method reference to isFactor on myIntNum2 is created,
       * and used to call isFactor() via test().
       */
      ip = myIntNum2::isFactor;
      result = ip.test(3);
      if (!result) {
         System.out.println("3 is not a factor of " + myIntNum2.getNum());
      }
   }
}
