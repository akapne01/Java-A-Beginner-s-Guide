package Ch12_Enumarations_Autoboxing_Static_import_Annotations;

/**
 * p. 431
 * Try This 12-1
 * A simulation of the Traffic Light that uses enumeration
 * to describe light's color.
 */

// An enumeration of the colors of a traffic light
enum TrafficLightColor {
   RED, GREEN, YELLOW
}

// A computerized traffic light

/**
 * Implements Runnable because sepaarate thread is used to run
 * each traffic light. This thread will cycle through the
 * colors.
 */
class TrafficLightSimulator implements Runnable {

   private TrafficLightColor trafficLightColor;
   private boolean stopSimulation = false;
   private boolean hasLightChanged = false;

   TrafficLightSimulator(TrafficLightColor initialColor) {
      trafficLightColor = initialColor;
   }

   TrafficLightSimulator() {
      trafficLightColor = TrafficLightColor.RED;
   }

   // Start up the light
   @Override
   public void run() {
      while (!stopSimulation) {
         try {
            switch (trafficLightColor) {
               case RED:
                  Thread.sleep(12000); // red for 12 sec
                  break;
               case YELLOW:
                  Thread.sleep(2000); // yellow for 2 sec
                  break;
               case GREEN:
                  Thread.sleep(10000); // green for 10 sec
                  break;
            }
         } catch (InterruptedException e) {
            System.out.println(e);
         }

         changeColor();
      }
   }

   // Change color
   synchronized void changeColor() {
      switch (trafficLightColor) {
         case RED:
            trafficLightColor = TrafficLightColor.GREEN;
            break;
         case YELLOW:
            trafficLightColor = TrafficLightColor.RED;
            break;
         case GREEN:
            trafficLightColor = TrafficLightColor.YELLOW;
      }

      hasLightChanged = true;
      notify(); // signal that light has changed
   }

   // Wait until a light change occurs
   synchronized void waitForChange() {
      try {
         while (!hasLightChanged) {
            wait(); // wait for light to change
         }
         hasLightChanged = false;
      } catch (InterruptedException e) {
         System.out.println(e);
      }
   }

   // Return current coloe
   synchronized TrafficLightColor getColor() {
      return trafficLightColor;
   }

   // Stop the traffic light
   synchronized void cancel() {
      stopSimulation = true;
   }
}

public class TrafficLightDemo {
   public static void main(String[] args) {
      TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
      Thread thread = new Thread(t1);
      thread.start();

      for (int i = 0; i < 9; i++) {
         System.out.println(t1.getColor());
         t1.waitForChange();
      }

      t1.cancel();
   }
}
