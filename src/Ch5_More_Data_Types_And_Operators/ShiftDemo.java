/*
    p. 177
    Demonstrate shift << and >> operators
    Output:

    0 0 0 0 0 0 0 1
    0 0 0 0 0 0 1 0
    0 0 0 0 0 1 0 0
    0 0 0 0 1 0 0 0
    0 0 0 1 0 0 0 0
    0 0 1 0 0 0 0 0
    0 1 0 0 0 0 0 0
    1 0 0 0 0 0 0 0

    1 0 0 0 0 0 0 0
    0 1 0 0 0 0 0 0
    0 0 1 0 0 0 0 0
    0 0 0 1 0 0 0 0
    0 0 0 0 1 0 0 0
    0 0 0 0 0 1 0 0
    0 0 0 0 0 0 1 0
    0 0 0 0 0 0 0 1


 */

package Ch5_More_Data_Types_And_Operators;

public class ShiftDemo {
    public static void main(String[] args) {
        int val = 1;
        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t /= 2) {
                if ((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val <<= 1; // left shift
        }
        System.out.println();

        val = 128;
        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t /= 2) {
                if ((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val >>= 1; // right shift
        }
    }
}
