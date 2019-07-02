package Ch12_Enumarations_Autoboxing_Static_import_Annotations;
import java.lang.Enum;
/**
 * p. 424
 * Uses enumation of Transport varieties to control switch
 */

enum Transport {
   CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo {
   public static void main(String[] args) {
      Transport transport;

      transport = Transport.AIRPLANE;

      // Output an enum value
      System.out.println("Value of trasport: " + transport);
      System.out.println();

      transport = Transport.TRAIN;

      // Compare 2 enum values
      if (transport == Transport.TRAIN) {
         System.out.println("Transport contains TRAIN.\n");
      }

      // Use enum to control switch statement
      switch (transport) {
         case CAR:
            System.out.println("A car carries people.");
            break;
         case TRUCK:
            System.out.println("A truck carries freight.");
            break;
         case AIRPLANE:
            System.out.println("An airplane flies.");
            break;
         case TRAIN:
            System.out.println("A train runs on rails.");
            break;
         case BOAT:
            System.out.println("A boat sails on water.");
            break;
      }
   }
}
