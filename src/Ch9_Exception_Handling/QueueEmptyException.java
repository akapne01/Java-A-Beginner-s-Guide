package Ch9_Exception_Handling;


/*
 * p. 331
 * Try This 9-1
 * Custom exception class that indicates that queue is Empty
 * from 8-1 try this project
 * This exception can be thrown by get() method
 * Will be generated when attempt is made to get an
 * item (remove) in the queue where no items are present.
 */

public class QueueEmptyException extends Exception {
    public String toString() {
        return "\nQueue is empty.";
    }
}
