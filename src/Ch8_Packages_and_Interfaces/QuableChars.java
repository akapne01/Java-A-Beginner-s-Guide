package Ch8_Packages_and_Interfaces;

/*
 * p. 291
 * Try this 8-1
 * Creating an interface that implements concept of Queue
 * for chars
 */

public interface QuableChars {
    /**
     * Puts characters in the the Queue
     */
    void putChar(char ch);

    /**
     * Get character from the Queue
     */
    char getChar();

}
