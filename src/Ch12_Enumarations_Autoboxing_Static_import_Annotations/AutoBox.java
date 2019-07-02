package Ch12_Enumarations_Autoboxing_Static_import_Annotations;

/**
 * p. 439
 * Demonstrate autoboxing/unboxing
 */

public class AutoBox {
   public static void main(String[] args) {

      Integer iOb = 100; // autobox

      int i = iOb; // auto-unbox

      System.out.println(i + " " + iOb);
   }
}
