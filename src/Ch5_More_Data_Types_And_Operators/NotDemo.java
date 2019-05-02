/*
    p. 175
    Demonstrates the bitwise NOT

    Output:
    1 1 0 1 1 1 1 0
    0 0 1 0 0 0 0 1
    Prints out the byte and reverse byte in binary

 */

package Ch5_More_Data_Types_And_Operators;

public class NotDemo {
    public static void main(String[] args) {
        byte b = -34;
        for (int t = 128; t > 0; t /= 2) {
            if ((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();

        // reverse all bits
        b = (byte) ~b;

        for (int t = 128; t > 0; t /= 2) {
            if ((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
