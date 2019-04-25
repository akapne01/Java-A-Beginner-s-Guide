/*
    p.102 - BG
    Reads characters from the keyboard until a period is received.
    Have the program count spaces. Report the total at the end of
    the program.
 */

package Ch3_Program_Control_Statements;

public class ReadsSentenceCountsSpaces {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int totalSpaces = 0;

        do {
            ch = (char) System.in.read();
            if (ch == ' ') totalSpaces++;
        } while (ch != '.');

        System.out.println("Total number of spaces is " + totalSpaces);
    }
}
