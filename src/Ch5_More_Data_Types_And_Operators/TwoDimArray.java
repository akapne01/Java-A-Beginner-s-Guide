/*
    p 142
    Demonstrate a two dimensional array
 */
package Ch5_More_Data_Types_And_Operators;

public class TwoDimArray {
    public static void main(String[] args) {

        int table[][] = new int[3][4];
        for (int t = 0; t < 3; ++t) {
            for (int i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                System.out.print(table[t][i] + " ");
            } // for i

            System.out.println();

        } // for t
    } // m
} // c
