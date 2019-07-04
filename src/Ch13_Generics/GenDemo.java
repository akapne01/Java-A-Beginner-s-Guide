package Ch13_Generics;

/**
 * p. 453
 * A simple generic class
 * Here, T is a type parameter that will be
 * replaced by real type when an object of
 * type Gen is created.
 */

// Declare a generic class. T is the generic type parameter
class Gen<T> {

   // Declare object of type R
   T ob;

   // Pass the constructor a reference to an object of type T
   Gen(T o) {
      ob = o;
   }

   // Return ob
   T getObj() {
      return ob;
   }

   // Show type of T
   void showType() {
      System.out.println("Type of T is " + ob.getClass().getName());
   }
}

// Demonstrate the generic class
public class GenDemo {
   public static void main(String[] args) {
      // Create a generic reference for Integers
      Gen<Integer> iOb;

      /* Create a Gen<Integer> object and assign its reference to iOb.
       * Notice the use of autoboxing to encapsulate the value 88 within
       * an Integer object.
       */
      iOb = new Gen<Integer>(88);

      // show the type of data used by iOb.
      iOb.showType();

      // Get the value of iOb. Notice that no case is needed.
      int v = iOb.getObj();
      System.out.println("value: " + v);

      System.out.println();

      // Create a generic object of Strings
      Gen<String> strObj = new Gen<String>("Generics Test.");

      // Show the type of data used by strOb.
      strObj.showType();

      // Get value of strObj. Notice, no cast needed
      String str = strObj.getObj();
      System.out.println("value: " + str);
   }
}
