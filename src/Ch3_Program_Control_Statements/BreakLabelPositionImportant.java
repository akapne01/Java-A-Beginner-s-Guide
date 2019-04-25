/*
    p. 94 - BG
    Where you put label is important
 */
package Ch3_Program_Control_Statements;

public class BreakLabelPositionImportant {

    public static void main(String[] args) {

        // label before for statement
        /*
            Label precedes the outer loop. When break executes, transfers
            control to end of the entire for block, skips the rest of the
            outer loop's iterations
         */
        stop1:
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            } // for y - s1
        } // for x - s1

        System.out.println();

        // label immediately before {
        /*
            Here break proceeds to the outer for opening curly brace.
            When break stop2 executes, control is transferred to the end of the
            outer for loop
         */
        for (int x = 0; x < 5; x++) {
            stop2:
            {
                for (int y = 0; y < 5; y++) {
                    if (y == 2) break stop2;
                    System.out.println("x and y: " + x + " " + y);

                } // for y - s2
            } // stop2
        } // for x - s2

    } // main
} // class
