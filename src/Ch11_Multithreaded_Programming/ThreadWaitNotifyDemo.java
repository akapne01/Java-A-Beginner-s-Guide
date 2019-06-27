package Ch11_Multithreaded_Programming;

/**
 * p. 409
 * Use wait() and notify() to create a ticking of the clock
 * notify() and wait() apply only to synchronised methods.
 */

class TickTock {

   /**
    * Heart of the clock. Consists of two methods tick() and tock()
    * which communicate with each other to make sure tock always
    * follows tick.
    *
    * @param clockState when the clock is running it is either
    *                   ticked or tocked. Indicates current state
    *                   of the clock.
    * Whe the
    */


   String clockState;

   /**
    *
    * @param running used to provide clean shut down of the clock
    *                if false => clock stopped
    *                state is set to Ticked and call to notify()
    *                enables the other waiting threads to run.
    */
   synchronized void tick(boolean running) {
      if (!running) { // stop the clock
         clockState = "ticked";
         notify(); // notify any waiting threads
         return;
      }

      System.out.print("Tick ");

      clockState = "ticked"; // set the current state to ticked
      notify(); // let tock() run
      try {
         while (!clockState.equals("tocked")) {
            wait(); // wait for tock to complete
         }
      } catch (InterruptedException e) {
         System.out.println("Thread interrupted.");
      }
   }

   synchronized void tock(boolean running) {
      if (!running) {
         clockState = "tocked";
         notify(); // notify all waiting threads
         return;
      }

      System.out.println("Tock");

      clockState = "tocked";
      notify();
      try {
         /**
          * While loop prevents spurious wake up.
          * If state !equal to "tocked" then
          * spurious wake up occured
          */
         while (!clockState.equals("ticked")) {
            /**
             * wait() suspends the thread until another
             * thread calls notify()
             */
            wait(); // wait for tick to complete
         }
      } catch (InterruptedException e) {
         System.out.println("Thread interrupted.");
      }
   }
}

class TickTockThread implements Runnable {

   Thread thread;
   TickTock tickTock;

   // Construct a new thread
   TickTockThread(String threadName, TickTock tickTock) {
      thread = new Thread(this, threadName);
      this.tickTock = tickTock;
   }

   // A factory method that creates and starts a thread
   public static TickTockThread createAndStart(String name, TickTock tickTock) {
      TickTockThread tickTockThread = new TickTockThread(name, tickTock);

      tickTockThread.thread.start(); // start the thread
      return tickTockThread;
   }

   // Entry point of thread
   @Override
   public void run() {
      if (thread.getName().compareTo("Tick") == 0) {
         for (int i = 0; i < 5; i++) {
            tickTock.tick(true);
         }
         tickTock.tick(false);
      } else {
         for (int i = 0; i < 5; i++) {
            tickTock.tock(true);
         }
         tickTock.tock(false);
      }
   }
}

public class ThreadWaitNotifyDemo {
   public static void main(String[] args) {
      // tickTock object is used to start the 2 thread of execution.
      TickTock tickTock = new TickTock();
      TickTockThread tickTockThread1 = TickTockThread.createAndStart("Tick", tickTock);
      TickTockThread tickTockThread2 = TickTockThread.createAndStart("Tock", tickTock);

      try {
         tickTockThread1.thread.join();
         tickTockThread2.thread.join();
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }
   }
}
