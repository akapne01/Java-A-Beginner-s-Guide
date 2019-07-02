package Ch12_Enumarations_Autoboxing_Static_import_Annotations;

/**
 * p. 426
 * Use the builtin enumation methods
 */
public class EnumDemoUsingBuiltinMethods {
   public static void main(String[] args) {
      Transport transport;
      System.out.println("Here are all transport constants");

      // Use values()
      Transport allTransports[] = Transport.values();

      /*
       * for could have been re-written without declaring array,
       * but to loop through Transport.values() instead.
       */
      for (Transport t : allTransports) {
         System.out.println(t);
      }
      System.out.println();

      // use valueOf()
      transport = Transport.valueOf("AIRPLANE");
      System.out.println("transport contains " + transport);
   }
}
