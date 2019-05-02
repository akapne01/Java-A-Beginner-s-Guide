/*
    p. 179
    Try this 5-3
    Enables to display in binary the bit pattern for any int value

    Output:
    123 in binary:
    01111011

    87987 in binary:
    00000000 00000001 01010111 10110011

    237658768 in binary:
    00000000 00000000 00000000 00000000 00001110 00101010 01100010 10010000

    Low order 8 bits of 87987 in binary:
    10110011
 */

package Ch5_More_Data_Types_And_Operators;

class ShowBits {
    // number of bits to display
    int numbits;

    ShowBits(int n) {
        numbits = n;
    } // constructor

    void show(long val) {
        long mask = 1;

        // left-shift a 1 into the proper position
        mask <<= numbits - 1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

// Demonstrates show bits
public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        byte b1 = 123;


        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("\n87987 in binary: ");
        i.show(87987);

        System.out.println("\n237658768 in binary:");
        li.show(237658768);

        // you can also show low-order bits of any integer
        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }
}
