/*
    Uses break to exit the loop
 */

package Ch3_Program_Control_Statements;

public class BreakDemo {
    public static void main(String[] args) {

        int num = 100;

        // loop while i-squared is less than num
        for (int i = 0; i < num; i++) {
            if (i*i >= num) break; // terminates loop if i*i >= 100;
            System.out.print(i + " ");
        } // for

        System.out.println("Loop complete.");

    } // main
} // class
