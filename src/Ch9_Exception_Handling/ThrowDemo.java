package Ch9_Exception_Handling;

/*
 * p. 318
 * Manually throw exception using throw keyword
 */

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw");
            /* Throw throws an object. You must create a
             * new object for it to throw. You cannot just
             * throw a type.
             */
            throw new ArithmeticException();
        }
        catch (ArithmeticException exception) {
            // Catch the exception
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}
