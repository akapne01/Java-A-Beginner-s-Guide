package Ch9_Exception_Handling;

/*
 * p. 325
 * Using Throws
 * If method generates exception that it doesn't handle, it must declare
 * that exception in the throws clause.
 *
 * Exceptions that are subclasses of Error or RuntimeException doesn't need
 * to be specified in the throws list.
 * Java simply assumes tha the method might throw one.
 * All other types of exceptions do need to be declared. Failure to do so
 * causes a compile-time error (xNC).
 */

public class ThrowsDemo {

    /* Input statement might generate an IOException.
     * Prompt() doesn't handle IOException itself. Instead it uses a throw clause,
     * which means that the calling method must handle it.
     * Calling method is main() and it deals with error
     */
    public static char prompt(String str) throws java.io.IOException {
        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String args[]) {
        char ch;

        try {
            ch = prompt("Enter a letter");
        } catch (java.io.IOException exception) {
            System.out.println("I/O exception occurred.");
            ch = 'X';
        }

        System.out.println("You pressed " + ch);
    }
}
