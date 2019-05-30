package Ch9_Exception_Handling;

/*
 * p. 313
 * Demonstrates that only exceptions of the correct type will be caught. All other
 * ones will not be and the program will halt.
 * Out-of-bounds exception cannot be caught with Arithmetic Exception.
 *
 * The output in the console informs that the exception is ArrayIndexOutOfBounds
 * exception. Then it shows before the exception println. After informs that
 * there is a exception type mismatch.
 */

public class ExceptionTypeMismatch {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Before the exception.");

            // Generate an index out of bounds exception
            nums[7] = 10;
            System.out.println("This won't be displayed.");
        }
        /* Can't catch an array boundary error with an
           ArithmeticException. */ catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Index out-of-bounds. ");
        }
        System.out.println("After catch statement.");
    }
}
