/**
 * p. 514
 * Use an instance method reference to refer to any instance.
 */

package Ch14_Lambda_Expressions_Method_References;

/**
 * A functional interface for numeric predicates that operate on an object
 * of type MyIntNum and an integer value.
 */
interface MyIntNumPredicate {
   boolean test(MyIntNum mv, int n);
}

public class MethodRefDemo3 {
   public static void main(String[] args) {

      boolean result;

      MyIntNum myNum = new MyIntNum(12);
      MyIntNum myNum2 = new MyIntNum(16);

      // This makes imp refer to the instance method isFactor().
      MyIntNumPredicate inp = MyIntNum::isFactor; // This is a method reference to any object of type MyIntNum

      // Calls isFactor() on myNum
      result = inp.test(myNum, 3);
      if (result) {
         System.out.println("3 is a factor of " + myNum.getNum());
      }

      // Calls isFactor() on myNum2
      result = inp.test(myNum2, 3);
      if (!result) {
         System.out.println("3 is not a factor of " + myNum2.getNum());
      }
   }
}
