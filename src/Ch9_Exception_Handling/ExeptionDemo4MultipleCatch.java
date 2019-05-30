package Ch9_Exception_Handling;

/*
 * p. 315
 * Using multiple catch statements
 * Arithmetic Exception is catching the division by 0 error
 * Array Out of bounds is catching the array out of bounds error.
 *
 * Catch expressions are checked in order in which they occur in
 * program. Only matching statement is executed. All other catch blocks are ignored.
 */

public class ExeptionDemo4MultipleCatch {
    public static void main(String[] args) {
        // Here numer is longer thant denom.
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArithmeticException exception) {
                // Catch the division by zero
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exception) {
                // Catch array out-of-bounds
                System.out.println("No matching element found!");
            }
        }
    }
}
