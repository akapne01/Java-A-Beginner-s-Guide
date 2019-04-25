/*
    p. 102 - BG
    Chapter 3 - Self Test (4)
    Write for statement for a loop that is counting from 1000 to 0 by -2.
 */
package Ch3_Program_Control_Statements;

public class CountsBackwardsBy2 {
    public static void main(String[] args) {
        for (int i = 1000; i >= 0; i -= 2) {
            System.out.println(i + " ");
        }
    }
}
