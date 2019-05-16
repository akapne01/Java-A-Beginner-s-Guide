/*
    p. 145
    Init 2 dim array
 */
package Ch5_More_Data_Types_And_Operators;

public class Squares {
    public static void main(String[] args) {

        // init 2 dim array
        int sqrs[][] = {
                {1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100}

        };

        // loop through it and print out
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(sqrs[i][j] + " ");
            System.out.println();
        }
    }
}
