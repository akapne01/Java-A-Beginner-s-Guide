/*
    p. 103 - BG - Chapter 3 Self Test - (10)
    Lowercase and uppercase letters are separated by 32.
    Convert lowercase to uppercase
    All uppercase to lowercase, displaying the result.
    Make no changes to any other character

    Program stops when user enters a period.

    Count all the conversions taking place, display the result
    a = 97
    z = 122
    A = 65
    Z = 90
 */

package Ch3_Program_Control_Statements;

public class LovercaseAndUppercase {
    public static void main(String[] args) throws java.io.IOException {

        char ch, ignore, chTransformed;
        int count = 0;

        do {
            ch = (char) System.in.read();
            if (ch >= 'A' && ch <= 'Z') {
                chTransformed = (char) (ch + 32);
                count++;
            } else if (ch >= 'a' && ch <= 'z') {
                chTransformed = (char) (ch - 32);
                count++;
            } else chTransformed = ch;

            System.out.println(chTransformed);

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (ch != '.');

        System.out.println("Transformation took place " + count + " times.");
    }
}
