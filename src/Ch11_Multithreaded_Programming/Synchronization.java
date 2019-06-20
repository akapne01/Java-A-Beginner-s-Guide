package Ch11_Multithreaded_Programming;

/**
 * p. 402
 * Use keyword synchronize to control access
 */

class SumArray {
   private int sum;

   synchronized int sumArray(int nums[]) {
      sum = 0; // reset sum

      for (int i = 0; i < nums.length; i++) {
         sum += nums[i];
         System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
         try {
            Thread.sleep(10); // allow task switch
         } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
         }
      }
      return sum;
   }
}

class SynThread implements Runnable {

   Thread thread;
   static SumArray sa = new SumArray();
   int a[];
   int answer;

   // Construct a new thread
   SynThread(String name, int nums[]) {
      thread = new Thread(this, name);
      a = nums;
   }

   /**
    * A factory method that creates and starts a thread.
    */
   public static SynThread createAndStart(String name, int nums[]) {
      SynThread myThread = new SynThread(name, nums);

      myThread.thread.start(); // starts the thread
      return myThread;
   }

   @Override
   public void run() {
      int sum;

      System.out.println(thread.getName() + " starting.");
      answer = sa.sumArray(a);
      System.out.println("Sum for " + thread.getName() + " is " + answer);

      System.out.println(thread.getName() + " terminating.");
   }
}

public class Synchronization {
   public static void main(String[] args) {
      int a[] = {1, 2, 3, 4, 5,};
      SynThread mt1 = SynThread.createAndStart("Child #1", a);
      SynThread mt2 = SynThread.createAndStart("Child #2", a);

      try {
         mt1.thread.join();
         mt2.thread.join();
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }
   }
}
