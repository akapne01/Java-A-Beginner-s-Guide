package Ch11_Multithreaded_Programming;

/**
 * p. 392
 * Creating multiple threads
 */

public class MultipleThreads {
   public static void main(String[] args) {
      System.out.println("Main thread starting.");

      ImprovedThead mt1 = ImprovedThead.createAndStart("Child #1");
      ImprovedThead mt2 = ImprovedThead.createAndStart("Child #2");
      ImprovedThead mt3 = ImprovedThead.createAndStart("Child #3");

      for (int i = 0; i < 50; i++) {
         System.out.print(".");
         try {
            Thread.sleep(100);
         } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
         }
      }
      System.out.println("Main thread ending.");
   }
}
