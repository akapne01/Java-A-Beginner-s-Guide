/*
    *** This program doesn't compile ***
    * p.95 - BG
 */
package Ch3_Program_Control_Statements;

public class BreakErrorNC {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.println("Pass " + i + ": ");
        } // one

        for (int j = 0; j < 100; j++) {
            // if (j == 10) break one;
            /*
            Error is here because block one is already finished
            there is no way for this program to break out to one.
            It is not possible to transfer control to the bock
            already finished.
             */
            System.out.print(j + " ");
        }
    }
}
