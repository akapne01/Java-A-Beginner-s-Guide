package Ch9_Exception_Handling;


/*
 * p. 291
 * Try this 8-1
 * Creating an interface that implements concept of Queue
 * for chars
 */

public interface ICharQ {
    /**
     * Puts characters in the the Queue
     */
    void putChar(char ch) throws QueueFullException;

    /**
     * Get character from the Queue
     */
    char getChar() throws QueueEmptyException;
}
