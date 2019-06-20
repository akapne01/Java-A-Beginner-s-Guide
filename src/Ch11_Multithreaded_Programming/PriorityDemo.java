package Ch11_Multithreaded_Programming;

/**
 * p. 398
 * Demonstrates priority for different threads
 */

class Priority implements Runnable {

   int count;
   Thread thread;

   static boolean stop = false;
   static String currentName;

   // Construct a new Thread
   Priority(String name) {
      thread = new Thread(this, name);
      count = 0;
      currentName = name;
   }

   // Entry point to the thread
   @Override
   public void run() {
      System.out.println(thread.getName() + " starting.");
      do {
         count++;

         if (currentName.compareTo(thread.getName()) != 0) {
            currentName = thread.getName();
            System.out.println("In " + currentName);
         }
      } while (stop == false && count < 10_000_000); // The first thread ti 10,000,000 stops all threads
      stop = true;

      System.out.println("\n" + thread.getName() + " terminating.");
   }
}

public class PriorityDemo {
   public static void main(String[] args) {

      Priority mt1 = new Priority("High Priority");
      Priority mt2 = new Priority("Low Priority");
      Priority mt3 = new Priority("Normal Priority #1");
      Priority mt4 = new Priority("Normal Priority #2");
      Priority mt5 = new Priority("Normal Priority #3");

      // Set the priorities
      mt1.thread.setPriority(Thread.NORM_PRIORITY + 2);
      mt2.thread.setPriority(Thread.NORM_PRIORITY - 2);

      // Leave mt3, mt4, mt5 as default, normal priority level

      // Start the threads
      mt1.thread.start();
      mt2.thread.start();
      mt3.thread.start();
      mt4.thread.start();
      mt5.thread.start();

      try {
         mt1.thread.join();
         mt2.thread.join();
         mt3.thread.join();
         mt4.thread.join();
         mt5.thread.join();
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }

      System.out.println("\nHigh priority thread counted to " + mt1.count + " priority was " + mt1.thread.getPriority());
      System.out.println("Low priority thread counted to " + mt2.count + " priority was " + mt2.thread.getPriority());
      System.out.println("1st Normal priority thread counted to " + mt3.count + " priority was " + mt3.thread.getPriority());
      System.out.println("2nd Normal priority thread counted to " + mt4.count + " priority was " + mt4.thread.getPriority());
      System.out.println("3rd Normal priority thread counted to " + mt5.count + " priority was " + mt5.thread.getPriority());
   }
}
