package Ch9_Exception_Handling;

/*
 * p. 321
 * Use throwable methods
 * Output:
 * Before exception is generated.
java.lang.ArrayIndexOutOfBoundsException: 7
Standard message is:
java.lang.ArrayIndexOutOfBoundsException: 7
	at Ch9_Exception_Handling.ExceptionTest.generateException(ExceptionDemo2.java:17)

Stack trace:
	at Ch9_Exception_Handling.UseThrowableMethoods.main(UseThrowableMethoods.java:10)
After the catch statement.

 */
public class UseThrowableMethoods {
    public static void main(String[] args) {
        try {
            ExceptionTest.generateException();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Standard message is: ");
            System.out.println(exception);
            System.out.println("\nStack trace: ");
            exception.printStackTrace();

        }
        System.out.println("After the catch statement.");
    }
}
