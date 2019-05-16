/*
    Read input until q received p. 90
    No output printed, user needs to input chars. No action until q pressed.
 */

package Ch3_Program_Control_Statements;

public class BreakWhenKeyboardQ {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        for( ; ; ) {
            ch = (char) System.in.read(); // get a char
            if (ch == 'q') break;
        } //for

        System.out.println("You pressed q!");
    }
}

