/*
    p. 696 - BG
    Self Test Ch 3 (10)
    Book version
 */

package Ch3_Program_Control_Statements;

public class CaseChange {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int changes = 0;

        // only takes any action if letter entered, if other characters, no
        // action is taken.
        do {
            ch = (char) System.in.read();
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        } while (ch != '.');
        System.out.println("Case changes: " + changes);
    }
}
