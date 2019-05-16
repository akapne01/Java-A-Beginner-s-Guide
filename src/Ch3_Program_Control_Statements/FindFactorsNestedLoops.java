/*
    p. 101 - BG
    Use nested loops to find factors of numbers between 2 and 100
 */

package Ch3_Program_Control_Statements;

public class FindFactorsNestedLoops {
    public static void main(String[] args) {

        for (int i = 2; i <=100; i++) {
            System.out.print("Factors of " + i + ": ");
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) System.out.print(j + " ");
            } // for j
            System.out.println();
        } // for i
    } // main
} // class
