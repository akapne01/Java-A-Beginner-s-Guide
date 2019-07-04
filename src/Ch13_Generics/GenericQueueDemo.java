package Ch13_Generics;

/**
 * p. 477
 * Try This 13-1
 * Demonstrate generic queue class.
 */

public class GenericQueueDemo {
   public static void main(String[] args) {

      // Create an Integer queue.
      Integer iStore[] = new Integer[10];
      GenericQueue<Integer> q = new GenericQueue<>(iStore);

      Integer iVal;

      System.out.println("Demonstrate a queue of Integers.");
      try {
         for (int i = 0; i < 5; i++) {
            System.out.println("Adding " + i + " to q.");
            q.put(i); // add Integer value to the queue.
         }
      } catch (QueueFullException e) {
         System.out.println(e);
      }

      System.out.println();

      try {
         for (int i = 0; i < 5; i++) {
            System.out.print("Getting next Integer from q: ");
            iVal = q.get();
            System.out.println(iVal);
         }
      } catch (QueueEmptyException e) {
         System.out.println(e);
      }

      System.out.println();

      // Create a Double queue.
      Double dStore[] = new Double[10];
      GenericQueue<Double> q2 = new GenericQueue<Double>(dStore);

      Double dVal;

      System.out.println("Demonstrate a queue of Doubles.");
      try {
         for (int i = 0; i < 5; i++) {
            System.out.println("Adding " + (double) i / 2 + " to q2.");
            q2.put((double) i / 2); // add Integer value to the queue.
         }
      } catch (QueueFullException e) {
         System.out.println(e);
      }

      System.out.println();

      try {
         for (int i = 0; i < 5; i++) {
            System.out.print("Getting next Double from q2: ");
            dVal = q2.get();
            System.out.println(dVal);
         }
      } catch (QueueEmptyException e) {
         System.out.println(e);
      }

      System.out.println();
   }
}

