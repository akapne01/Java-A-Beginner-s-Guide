package Ch12_Enumarations_Autoboxing_Static_import_Annotations;

/**
 * p. 438
 * Demonstrate manual boxing and unboxing with a type
 * wrapper
 */

public class Wrap {
   public static void main(String[] args) {

      // Manually boxing value of 100
      Integer iOb = new Integer(100);

      // Manually unbox value in iOb
      int i = iOb.intValue();

      System.out.println(i + " " + iOb);
   }
}
