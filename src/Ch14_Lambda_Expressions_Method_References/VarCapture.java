package Ch14_Lambda_Expressions_Method_References;

/**
 * p. 507
 * An example of capturing a local variable from the enclosing scope.
 */

interface MyFunc {
   int func(int n);
}

class VarCapture {
   int a;

   public static void main(String[] args) {

      /** A local variable that can be captured */
      int num =10;
      int b = 9;

      MyFunc myLambda = (n) -> {
         /** This use of num is ok, it doesn't modify num. */
         int v = num + n;

         /** The following is illegal, because it attempts to modify the value of num */
//         num++;
         return v;
      };

      /** Use the lambda. This will display 18. */
      System.out.println(myLambda.func(8));

      /** The following line would also cause an error, because it would remove the
      effectively final status from num. */
//      num = 9;

      VarCapture varCapture = new VarCapture();

      myLambda = n -> {
         int result = 10 + 20;
         varCapture.a++;
         return result;
      };

      System.out.println(myLambda.func(8));
      System.out.println("varCapture.a = " + varCapture.a);
      b++;
      System.out.println(b);

   }
}
