package Ch9_Exception_Handling;

/*
 * p. 316
 * Subclass must precede superclasses in catch statements
 */

public class ExeptionDemo5SubclassExeptions {
    public static void main(String[] args) {
        // Numer is longer than denom
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArrayIndexOutOfBoundsException exception) { // Subclass catch
                System.out.println("No matching element found!");
            }
            /* Superclass of all exceptions is Throwable, to catch
             * all exceptions can use throwable to catch them.
             * If you want to catch exceptions of both - super and
             * subclass type => Put subclass first. If you don't
             * then superclass will catch all derived classes.
             */
            catch (Throwable exception) { // Superclass catch
                System.out.println("Some exception occurred.");
            }
        }
    }
}
