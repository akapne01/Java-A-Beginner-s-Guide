package Ch11_Multithreaded_Programming;

/**
 * p. 397
 * Uses join() method to wait for the
 * child threads to finish
 */
public class JoinThreads {
   public static void main(String[] args) {
      System.out.println("Main thread starting.");

      ImprovedThead mt1 = ImprovedThead.createAndStart("Child #1");
      ImprovedThead mt2 = ImprovedThead.createAndStart("Child #2");
      ImprovedThead mt3 = ImprovedThead.createAndStart("Child #3");

      /**
       * Waits until specified thread ends.
       * After all calls ro join return, the threads have
       * stopped executing.
       */
      try {
         mt1.thread.join();
         System.out.println("Child #1 joined.");

         mt2.thread.join();
         System.out.println("Child #2 joined.");

         mt3.thread.join();
         System.out.println("Child #3 joined.");
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }
      System.out.println("Main thread ending.");
   }
}
