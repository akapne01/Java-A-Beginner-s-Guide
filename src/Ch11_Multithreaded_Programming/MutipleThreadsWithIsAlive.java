package Ch11_Multithreaded_Programming;

/**
 * p. 396
 * Same as multiple threads, but uses isAlive() method for
 * main method to finish the last instead of sleeping longer.
 */

public class MutipleThreadsWithIsAlive {
   public static void main(String[] args) {
      System.out.println("Main thread starting.");

      ImprovedThead mt1 = ImprovedThead.createAndStart("Child #1");
      ImprovedThead mt2 = ImprovedThead.createAndStart("Child #2");
      ImprovedThead mt3 = ImprovedThead.createAndStart("Child #3");

      do {
         System.out.print(".");
         try {
            Thread.sleep(100);
         } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
         }
      } while (mt1.thread.isAlive() || mt2.thread.isAlive() || mt3.thread.isAlive());
      System.out.println("Main thread ending");
   }
}
