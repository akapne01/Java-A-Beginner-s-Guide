/*
 * p. 219
 * Use showbits as a local class in the block
 * Show Bits class in this example is not known outside the main method
 * Any attempt to access it outside main method, will result in error.
 *
 */

package Ch6_Methods_Classes_Closer_Look;

public class LocalClassDemo {
    public static void main(String[] args) {

        // An inner class version of ShowBits
        // Class nested within the method
        class ShowBits {
            int numbits;

            ShowBits(int n) {
                numbits = n;
            }

            void show(long val) {
                long mask = 1;

                // left-shift a 1 into the proper position
                mask <<= numbits - 1;

                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {

                    if ((val & mask) == 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }

                    spacer++;

                    if ((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }

                System.out.println();

            }
        }

        for (byte b = 0; b < 10; b++) {
            ShowBits byteval = new ShowBits(8);
            System.out.print(b + " in binary: ");
            byteval.show(b);
        }
    }
}
