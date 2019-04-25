/*
    p. 103 - BG
    Chapter 3 - Self Test (9)
    Change Loop iteration variable in the way that it forms sequence
    1, 2, 4, 8, 16, 32, etc.

 */

package Ch3_Program_Control_Statements;

public class LoopDifferentIterationStep {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i *= 2) {
            System.out.print(i + " ");
        }
    }
}
