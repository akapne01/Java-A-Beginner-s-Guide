/*
 * p. 225
 * Varargs overloading and Ambiguity
 *
 * Program with error that will not compile.
 */

package Ch6_Methods_Classes_Closer_Look;

public class VarArgs4 {
    // use and int vararg parameter
    static void vaTest(int... v) {
        // do something
    }

    // Use booolean vararg parameter
    static void vaTest(boolean... v){
        // do something
    }

    /*
     * Looks like this solves the problem :)
     */
    static void vaTest() {
        // something else
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
        vaTest(); // With no arguments it is ambiguous and does not
        // know which one of the versions to choose

        /*
         * Overloading part is perfectly correct.
         * But does not compile because with no arguments it could
         * be both data types so compiler does not know which type to choose
         *
         * Also, if
         *  1) static void VaTest(int... v)
         *  2) static void VaTest(int n, int... v)
         * Although they differ and technically are perfectly valid
         * definition, but when following is called:
         *  vaTest(1) => compiler does not know which one to choose so
         *  there is an error
         *
         */
    }
}
