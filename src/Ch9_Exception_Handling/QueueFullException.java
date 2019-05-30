package Ch9_Exception_Handling;

/*
 * p. 331
 * Try This 9-1
 * Custom exception class that indicates that queue is full
 * from 8-1 try this project
 * This exception can be thrown by put() method
 * Will be generated when attempt is made to store an
 * item in the queue which is already full.
 */
public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {size =s;}

    public String toString() {
        return "\nQueue is full. Maximum size is " + size;
    }
}
