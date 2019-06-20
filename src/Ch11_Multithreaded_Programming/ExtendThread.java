package Ch11_Multithreaded_Programming;

/**
 * p. 388
 * Try this 11-1
 * Extends Thread class instead of implementing Runnable
 */

class NewThread extends Thread {

   // Construct a new thread
   NewThread(String name) {
      // super used to call this version of the Thread's constructor
      // Thread(String threadName)
      super(name); // name thread
   }

   // Entry point of thread
   public void run() {
      System.out.println(getName() + " starting.");
      try {
         for (int count = 0; count < 10; count++) {
            Thread.sleep(400);
            System.out.println("In " + getName() + ", count is " + count);
         }
      } catch (InterruptedException e) {
         System.out.println(getName() + " interrupted.");
      }

      System.out.println(getName() + " terminating.");
   }
}

public class ExtendThread {
   public static void main(String[] args) {
      System.out.println("Main thread starting.");

      NewThread newThread = new NewThread("Child #1");

      newThread.start();

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
