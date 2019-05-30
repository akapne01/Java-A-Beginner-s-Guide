package Ch9_Exception_Handling;

/*
 * p. 310
 * Demonstrate exception handling
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        /*
         * As soon as the exception is generated, it breaks out of the try
         * statement. Everything after it is not executed.
         *
         * After exception is caught, the program continues executing.
         *
         * Exception handler needs to implement remedy.
         */

        try {
            System.out.println("Before exception is generated.");

            // Generate an index out-of-bounds exception
            nums[7] = 10;

            System.out.println("This won't be displayed.");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
