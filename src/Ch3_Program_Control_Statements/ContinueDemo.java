/*
    p. 96 - BG
    Demo of Continue
    Prints out even numbers;
    If number is odd, goes to the next iteration
 */

package Ch3_Program_Control_Statements;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if ((i % 2) != 0) continue; // go to next iteration
            System.out.println(i);
        }
    } // main
} // class
