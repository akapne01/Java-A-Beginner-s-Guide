package Ch9_Exception_Handling;

/*
 * p. 312
 * Let JVM handle the error
 * Uncaught exception. JVM stops the program execution and throws an error
 * that breaks the program by terminating it. Execution is halted.
 */

public class NotHandled {
    public static void main(String[] args) {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // Generate an index out-of-bounds exception
        nums[7] = 10;


    }
}
