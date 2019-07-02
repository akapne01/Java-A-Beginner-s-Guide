package Ch12_Enumarations_Autoboxing_Static_import_Annotations;

/**
 * p. 439
 * Autoboxing/unboxing takes place with
 * method parameters and return values.
 */
public class AutoboxMethodandReturn {

   // This method has an Integer parameter
   static void acceptIntegerWrapperType(Integer v) { // Receives Integer
      System.out.println("accept IntegerWrapperType() received " + v);
   }

   // Method returns int
   static int returnPrimitiveInt() {
      return 10;
   }

   static Integer returnWrapperInt() {
      return 99; // Autoboxing 99 into an Integer
   }

   public static void main(String[] args) {
      /*
       * Pass an int to acceptIntegerWrapperType(). Because acceptIntegerWrapperType() has an Integer parameter,
       * the int value passed is automatically boxed.
       */
      acceptIntegerWrapperType(199);

      /*
       * Here, wrapperIntegerObject receives the int value returned by returnPrimitiveInt().
       * This value is automatically boxed sto that it can be
       * assigned to wrapperIntegerObject.
       */
      Integer wrapperIntegerObject = returnPrimitiveInt();
      System.out.println("Return value from returnPrimitiveInt() is " + wrapperIntegerObject);

      /*
       * Next, returnWrapperInt() is called. It returns an integer value
       * which is auto-unboxed int an int
       */
      int i = returnWrapperInt();
      System.out.println("Return value of returnWrapperInt() is " + i);

      /*
       * Next, Math.sqrt() is called with wrapperIntegerObject as an argument.
       * In this case, wrapperIntegerObject is auto-unboxed and its value
       * promoted to double, which is the type needed by sqrt().
       */
      wrapperIntegerObject = 100;
      /*
       * wrapperIntegerObject automatically unboxed to double and passed into sqrt() as
       * double is the type required byt Mat.sqrt()
       *
       * Value promoted to double
       */
      System.out.println("Square root of wrapperIntegerObject is " + Math.sqrt(wrapperIntegerObject));
      System.out.println(wrapperIntegerObject.getClass().getName());
   }
}
