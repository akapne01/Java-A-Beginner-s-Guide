package Ch9_Exception_Handling;

/*
 * p. 319
 * Rethrow exception.
 * If rethrown, caught by outer catch
 * Allows multiple handlers access to exception
 * Perhaps one handler manages one aspect of it
 * and other another aspect.
 * When you rethrow exception, it is not caught by
 * the same catch, but propagates to the next catch.
 */
class ReThrow {
    public static void generateException() {
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            /* Division by 0 errors are handled locally
             * by generateException(), but array boundary
             * error is re-thrown. IN this case this re-thrown
             * error is caught by main().
             */
            } catch (ArithmeticException exception) {
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("No matching element found.");
                throw exception; // rethrows the exception
            }
        }
    }
}

class ReThrowDemo {
    public static void main(String[] args) {
        try {
            ReThrow.generateException();
        } catch (ArrayIndexOutOfBoundsException exception) {
            // Re-catch exception
            System.out.println("Fatal error - program terminated!");
        }
    }
}
