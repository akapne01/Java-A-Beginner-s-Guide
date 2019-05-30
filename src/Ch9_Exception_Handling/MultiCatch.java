package Ch9_Exception_Handling;

/*
 * p. 326
 * Demonstrates multi-catch feature for exceptions
 */
public class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char chars[] = {'A', 'B', 'C',};

        for (int i = 0; i < 2; i++) {
            try {
                if (i ==0 ) {
                    result = a/b; // generate an Arithmetic Exception
                } else {
                    chars[5] = 'X'; // Generate an ArrayIndexOutOfBoundsException
                }
                // This catch clause catches both exception
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e);
            }
        }

        System.out.println("After multi-catch");
    }
}
