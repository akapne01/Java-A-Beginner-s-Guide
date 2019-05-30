package Ch9_Exception_Handling;

/*
 * p. 314
 * Highlights one of the Exception handling benefits:
 * Enables your program respond to an error and then continue running.
 * Once exception is handled, it is removed from the system.
 */

public class ExceptionDemo3Div0 {
    public static void main(String[] args) {
        int numer[] = {4, 8, 16, 32, 64, 128};
        int denom[] = {2, 0, 4, 4, 0, 8};

        // Each pass through the loop enters try block a new
        // Enables program to handle repeated errors
        // After exception is cached, it is cleared.
        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArithmeticException exception) {
                // catch the exception
                System.out.println("Can't divide by Zero!");
            }
        }
    }
}
