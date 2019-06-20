package Ch11_Multithreaded_Programming;

/**
 * p. 386
 * My thread variations. This version of ImprovedThread
 * creates a thread when its constructor is called and
 * stores it in an instance variable called thread.
 * It also sets a name of the thread and provides a
 * factory method to create and start a thread.
 */

class ImprovedThead implements Runnable {

   Thread thread; // stores a reference to a thread

   /*
    * Constructs a new thread using runnable and give it a name
    */
   ImprovedThead(String name) {
      thread = new Thread(this, name); // thread is named when created
   }

   /**
    * A factory method that creates and starts a thread
    */
   public static ImprovedThead createAndStart(String name) {
      ImprovedThead improvedThead = new ImprovedThead(name);
      improvedThead.thread.start(); // starts the thread
      return improvedThead;
   }

   /**
    * Entry point of thread
    */
   @Override
   public void run() {
      System.out.println(thread.getName() + " starting.");
      try {
         for (int count = 0; count < 10; count++) {
            Thread.sleep(400);
            System.out.println("In " + thread.getName() + ", count is " + count);
         }
      } catch (InterruptedException e) {
         System.out.println(thread.getName() + " interrupted.");
      }
      System.out.println(thread.getName() + " terminating.");
   }
}

public class ThreadVariations {
   public static void main(String[] args) {
      System.out.println("Main thread starting.");

      // Create and start a thread
      ImprovedThead myThread = ImprovedThead.createAndStart("Child #1");

      for (int i = 0; i < 50; i++) {
         System.out.print(".");
         try {
            Thread.sleep(100);
         } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
         }
      }

      System.out.println("Main thread ending.");
   }
}
