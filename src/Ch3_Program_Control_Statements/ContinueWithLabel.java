/*
    p. 96
    Use continue with the label
 */

package Ch3_Program_Control_Statements;

public class ContinueWithLabel {
    public static void main(String[] args) {

        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
            for (int j = 1; j < 10; j++) {
                // after continue executes, control passes to the outer loop, skipping the remainder of the inner loop
                if (j == 5) continue outerloop;
                System.out.print(j);
            } // for - inner j
        } // for - outer i w/ label
    } // main
} // class
