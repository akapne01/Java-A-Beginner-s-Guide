/*
    Uses break with nested loops
    p. 91 - BG
 */
package Ch3_Program_Control_Statements;

public class BreakWithNestedLoops {
    public static void main(String[] args) {

        // loops 3x
        for (int i = 0; i < 3; i++) {

            System.out.println("Outer loop count: " + i);
            System.out.print("    Inner lop count: ");

            int t = 0;

            // inner while loop, breaks out when t reaches 10 thus executing 10x
            while (t < 100) {
                if (t == 10) break; // terminate loop if t is 10
                System.out.print(t + " ");
                t++;
            } // while

            System.out.println();
        } // for

        System.out.println("Loops complete.");
    } // main
} // class
