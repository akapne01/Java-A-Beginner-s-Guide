package Ch11_Multithreaded_Programming;

/*
 * p. 382
 * Create a thread by implementing Runnable
 */

import org.jetbrains.annotations.Contract;

/**
 * MyThread objects can be run in their own threads,
 * because MyThread implements Runnable interface
 */
class MyThread implements Runnable {
   String threadName;

   MyThread(String name) {
      threadName = name;
   }

   // Entry point of the thread
   @Override
   public void run() {
      System.out.println(threadName + " starting");
      try {
         for (int count = 0; count < 10; count++) {
            Thread.sleep(400);
            System.out.println("In " + threadName + ", count is " + count);
         }
      } catch (InterruptedException e) {
         System.out.println(threadName + " interrupted.");
      }
      System.out.println(threadName + " terminating.");
   }
}

/**
 * Demo class showing how MyThread works
 */
public class UseThreads {
   public static void main(String[] args) {

      // First, construct myThread object that is Runnable
      MyThread myThread = new MyThread("Child #1");

      // Next, construct a thread from this object
      Thread newThread = new Thread(myThread);

      // Finally, start execution pf the thread
      newThread.start();

      /**
       * Sleep method causes the thread from which it is called to
       * suspend execution for the specified period of milliseconds.
       */
      for (int i = 0; i <50; i++) {
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
