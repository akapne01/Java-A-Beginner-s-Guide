package Ch11_Multithreaded_Programming;

/**
 * p. 415
 * Suspending, resuming and stopping a thread
 *
 * Thread class defines 2 boolean variables suspended and
 * stopped, which govern suspention and termination of a thread.
 * Both initialized to false by constructor.
 *
 * Run block contains synchronized that checks suspended.
 * If suspended, the wait method invoked to suspend execution
 * of the thread.
 *
 * mySuspend() => Suspends execution of the thread (sets suspended to true)
 * myResume() => Resumes execution. Sets suspended to false and invokes notify()
 * to restart the thread.
 * myStop() => Stops the thread by setting stopped to true. Also, sets suspended to
 * false and calls notify.
 */

class ThreadSupportingSuspension implements Runnable {

   Thread thread;
   boolean suspended; // Suspends thread when true
   boolean stopped; // Stops thread when true

   public ThreadSupportingSuspension(String name) {
      thread = new Thread(this, name);
      suspended = false;
      stopped = false;
   }

   /**
    * A Factory method that creates and starts a thread.
    */
   public static ThreadSupportingSuspension createAndStart(String name) {
      ThreadSupportingSuspension threadSupportingSuspension = new ThreadSupportingSuspension(name);
      threadSupportingSuspension.thread.start(); // Start the thread
      return threadSupportingSuspension;
   }

   // Entry point of thread
   @Override
   public void run() {
      System.out.println(thread.getName() + " starting.");
      try {
         for (int i = 0; i < 1000; i++) {
            System.out.print(i + " ");
            if ((i % 10) == 0) {
               System.out.println();
               Thread.sleep(250);
            }

            // Use synchronized block to check suspended and stopped
            synchronized (this) {
               while (suspended) {
                  wait();
               }
               if (stopped) {
                  break;
               }
            }
         }
      } catch (InterruptedException e) {
         System.out.println(thread.getName() + " interrupted.");
      }
      System.out.println(thread.getName() + " exiting");
   }

   // Stop the thread
   synchronized void myStop() {
      stopped = true;

      // The following ensures that a suspended thread can be stopped
      suspended = false;
      notify();
   }

   // Suspend the thread
   synchronized void mySuspend() {
      suspended = true;
   }

   // Resume the thread
   synchronized void myResume() {
      suspended = false;
      notify();
   }
}

public class Suspend {
   public static void main(String[] args) {
      ThreadSupportingSuspension mt1 = ThreadSupportingSuspension.createAndStart("My Thread");

      try {
         Thread.sleep(1000); // let ob1 thread start excecuting

         mt1.mySuspend();
         System.out.println("Suspending thread");
         Thread.sleep(1000);

         mt1.myResume();
         System.out.println("Resuming thread");
         Thread.sleep(1000);

         mt1.mySuspend();
         System.out.println("Suspending thread");
         Thread.sleep(1000);

         mt1.myResume();
         System.out.println("Resuming thread");

         mt1.mySuspend();
         System.out.println("Stopping thread");
         mt1.myStop();
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted");
      }

      // Wait for thread to finish
      try {
         mt1.thread.join();
      } catch (InterruptedException e) {
         System.out.println("Main thread Interrupted");
      }

      System.out.println("Main thread exiting");
   }
}
