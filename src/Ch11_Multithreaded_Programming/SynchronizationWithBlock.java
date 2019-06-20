package Ch11_Multithreaded_Programming;

/**
 * p. 402
 * Use keyword synchronize to control access
 */

class SumArray2 {
   private int sum;

   int sumArray(int nums[]) {
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

class SynThread2 implements Runnable {

   Thread thread;
   static SumArray2 sa = new SumArray2();
   int a[];
   int answer;

   // Construct a new thread
   SynThread2(String name, int nums[]) {
      thread = new Thread(this, name);
      a = nums;
   }

   /**
    * A factory method that creates and starts a thread.
    */
   public static SynThread2 createAndStart(String name, int nums[]) {
      SynThread2 myThread = new SynThread2(name, nums);

      myThread.thread.start(); // starts the thread
      return myThread;
   }

   @Override
   public void run() {
      int sum;

      System.out.println(thread.getName() + " starting.");

      // Synchronize calls to sumArray()
      synchronized (sa) {
         answer = sa.sumArray(a);
      }
      System.out.println("Sum for " + thread.getName() + " is " + answer);

      System.out.println(thread.getName() + " terminating.");
   }
}

public class SynchronizationWithBlock {
   public static void main(String[] args) {
      int a[] = {1, 2, 3, 4, 5,};
      SynThread2 mt1 = SynThread2.createAndStart("Child #1", a);
      SynThread2 mt2 = SynThread2.createAndStart("Child #2", a);

      try {
         mt1.thread.join();
         mt2.thread.join();
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }
   }
}
