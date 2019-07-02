package Ch12_Enumarations_Autoboxing_Static_import_Annotations;

/**
 * p. 430
 * Demonstrate ordinal() and compareTo()
 */
public class EnumDemoCompare {
   public static void main(String[] args) {
      Transport tp1, tp2, tp3;

      // Obtain all ordinal values using ordinal()
      System.out.println("Here are all transport constants and their ordinal values: ");
      for (Transport t : Transport.values()) {
         System.out.println(t + " " + t.ordinal());
      }

      tp1 = Transport.AIRPLANE;
      tp2 = Transport.TRAIN;
      tp3 = Transport.AIRPLANE;

      System.out.println();

      // Demonstrate compareTo()
      if (tp1.compareTo(tp2) < 0) {
         System.out.println(tp1 + " comes before " + tp2);
         System.out.println("tp1.compareTo(tp2) value is " + tp1.compareTo(tp2));
      }

      if (tp1.compareTo(tp2) > 0) {
         System.out.println(tp2 + " comes before " + tp1);
         System.out.println("tp1.compareTo(tp2) value is " + tp1.compareTo(tp2));
      }

      if (tp1.compareTo(tp3) == 0) {
         System.out.println(tp1 + " equals " + tp3);
         System.out.println("tp1.compareTo(tp3) value is " + tp1.compareTo(tp3));
      }
   }
}
