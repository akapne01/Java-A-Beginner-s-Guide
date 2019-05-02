/*
    p 174
    Lowercase letters using bitwise OR
    char = 16 bits
    Works by ORing each character value with 32 = 0000 0000 0010 0000
    Applying bitwise OR produces result in which only 6th bit is changed,
    all other bits remain unchanged.
    For chars this means that each uppercase letter is transformed into lowercase one.
 */

package Ch5_More_Data_Types_And_Operators;

public class LowLetters {
    public static void main(String[] args) {
        char ch;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // This statement turns on the 6th bit
            ch = (char)((int) ch | 32); // ch is now lowercase

            System.out.print(ch + " ");
        }
    }
}
