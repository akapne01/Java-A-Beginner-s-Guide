package Ch13_Generics;

/**
 * p. 476
 * A generic, fixed-sized queue class.
 */

public class GenericQueue<T> implements Quable<T> {

   private T q[]; // hold the queue
   private int putloc, getloc;

   // Construct an empty queue with the given array.
   public GenericQueue(T[] aRef) {
      q = aRef;
      putloc = getloc = 0;
   }

   // Put an item into the queue
   @Override
   public void put(T obj) throws QueueFullException {
      if (putloc == q.length) {
         throw new QueueFullException(q.length);
      }
      q[putloc++] = obj;
   }

   // Get a character from the Queue.
   @Override
   public T get() throws QueueEmptyException {
      if (getloc == putloc) {
         throw new QueueEmptyException();
      }
      return q[getloc++];
   }
}
