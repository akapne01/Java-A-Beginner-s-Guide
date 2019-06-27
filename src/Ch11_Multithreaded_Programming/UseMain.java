package Ch11_Multithreaded_Programming;

/**
 * p. 418
 * Try This 11-2
 * All programs have at least 1 thread of execution, called the main thread.
 * It is given to program automatically when it starts running.
 * This program shows that the main thread can be handled just like the other
 * threads.
 * <p>
 * Controlling the main thread.
 */

public class UseMain {
   public static void main(String[] args) {
      Thread thread;

      // Get the main thread
      thread = Thread.currentThread();

      // Display main thread's name
      System.out.println("Main thread is called " + thread.getName());

      // Display main thread's priority
      System.out.println("Priority: " + thread.getPriority());

      System.out.println();

      // Set the name and priority
      System.out.println("Setting name and priority.\n");
      thread.setName("Thread #1");
      thread.setPriority(Thread.NORM_PRIORITY + 3);

      System.out.println("Main thread is now called " + thread.getName());
      System.out.println("Priority is now: " + thread.getPriority());
   }
}
