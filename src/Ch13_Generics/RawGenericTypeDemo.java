package Ch13_Generics;

/**
 * p. 479
 * Demonstrate a raw type that is compatible with legacy code.
 */

public class RawGenericTypeDemo {
   public static void main(String[] args) {
      // Create a Gen object fo Integers.
      Gen<Integer> iOb = new Gen<Integer>(88);

      // Create a generic object for Strings
      Gen<String> strOb = new Gen<String>("Generics Test.");

      // Create a raw-type Gen object and give it a Double value.
      Gen raw = new Gen(98.6); // When no argument is supplied, raw type is created.

      // Case here is necessary because type is unknown.
      double d = (double) raw.getObj();
      System.out.println("value: " + d);

      /*
       * Use of the raw type can lead to runtime exceptions. Here are some examples.
       */

      // The following case causes a runtime error.
//      int i = (Integer) raw.getObj();

      // This assignment overrides type safety.
//      raw = iOb; // Ok, but potentially wrong.
//      d = (Double) raw.getObj(); // runtime error
   }
}
