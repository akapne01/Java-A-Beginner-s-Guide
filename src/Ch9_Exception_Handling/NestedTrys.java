package Ch9_Exception_Handling;

/*
 * p. 317
 * Nested try statements in exception handling.
 * Inner try allows program to catch exception and
 * continue, outer try causes program to terminate
 */
public class NestedTrys {
    public static void main(String[] args) {
        // Numer longer than denom
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        try { // Outer try
            for (int i = 0; i < numer.length; i++) {
                /* Exceptions that can be handled by inner try,
                 * allows program to continue
                 */
                try { // Nested try
                    System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
                } // nested try
                catch (ArithmeticException exception) {
                    // Catch the exception
                    System.out.println("Can't divide by Zero!");
                }
            } // for
        } // outer try
        /* Array boundary error is caught by the outer try and
         * that causes a program to terminate. Before in the previous
         * programs this error was printed 2x, now is printed only once
         * and terminates with exit code 0 as the exception was handled.
         */
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("No matching element found!");
            System.out.println("Fatal error - Program terminated.");
        }
    } // main
} // class
