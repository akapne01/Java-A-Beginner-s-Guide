/**
 * p. 515
 */
package Ch14_Lambda_Expressions_Method_References;

interface SomeTest2<T> {
   boolean test(T n, T m);
}

class MyClass2 {
   static <T> boolean myGenMethod(T x, T y) {
      boolean result = false;
      // ...
      return result;
   }
}

public class GenericDemo {
   public static void main(String[] args) {
      SomeTest2<Integer> mRef = MyClass2::<Integer>myGenMethod;
   }
}
