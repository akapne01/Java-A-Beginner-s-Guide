package Ch13_Generics;

/**
 * p. 475
 * An exception fot Queue Full errors.
 */
public class QueueFullException extends Exception {
   int size;

   QueueFullException(int s) {
      size = s;
   }

   public String toString() {
      return "\nQueue is full. Maximum size is " + size;
   }
}
