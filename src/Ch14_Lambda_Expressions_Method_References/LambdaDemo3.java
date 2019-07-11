package Ch14_Lambda_Expressions_Method_References;

/**
 * p. 498
 * Lambda expressions can be used with functional interface not only with primitive data types,
 * but also with Object data types.
 * <p>
 * Below functional interface that tests 2 strings.
 */

interface StringTest {
   boolean test(String aStr, String bStr);
}

public class LambdaDemo3 {
   public static void main(String[] args) {

      /**
       * This lambda expression determines if one string is a part of another.
       *
       * a.indexOf(b) => Returns the index within this string of the first
       * occurrence of the specified substring. If not found returns -1.
       */
      StringTest isIn = (a, b) -> a.indexOf(b) != -1;

      String str = "This is a test";
      System.out.println("Testing string: " + str);

      if (isIn.test(str, "is a")) {
         System.out.println("'is a' found");
      } else {
         System.out.println("is a' not found");
      }

      if (isIn.test(str, "xyz")) {
         System.out.println("'xyz' found");
      } else {

         System.out.println("'xyz' not found");
      }
   }
}
