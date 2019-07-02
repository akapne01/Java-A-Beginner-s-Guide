package Ch12_Enumarations_Autoboxing_Static_import_Annotations;

/**
 * p. 427
 * Use an enum constructor, instance variable, and method.
 */

enum Transport2 {
   CAR(65), TRUCK(55), AIRPLANE(100), TRAIN(70), BOAT(22);

   private int speed; // Typical speed of each transport

   // Constructor
   Transport2(int speed) {
      this.speed = speed;
   }

   int getSpeed() {
      return speed;
   }
}

public class EnumDemoConstructorsMethodsVars {
   public static void main(String[] args) {

      // Display the speed of an airplane
      System.out.println("Typical speed for an airplane is " + Transport2.AIRPLANE.getSpeed() + " miles per hour.\n");

      // Display all Transports and speeds
      System.out.println("All Transport speeds: ");
      for (Transport2 t : Transport2.values()) {
         System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
      }
   }
}
