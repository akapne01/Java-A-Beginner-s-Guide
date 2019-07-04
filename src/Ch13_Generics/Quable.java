package Ch13_Generics;


/**
 * p. 475
 * IGenQ.java
 * Try this 13-1
 * A generic queue interface.
 */

public interface Quable<T> {

   // Put an item into the queue
   void put(T ch) throws QueueFullException;

   // Get an item from the queue.
   T get() throws QueueEmptyException;
}
