/*
    p. 173
    Display the bits within a byte
    Displays the value of byte in bits
 */

package Ch5_More_Data_Types_And_Operators;

public class ShowBitsOne {
    public static void main(String[] args) {
        byte val;

        val = 123; // 0 1 1 1 1 0 1 1
        for (int t = 128; t > 0; t /= 2) {
            if ((val &t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
