/*
 * p. 221
 * Variable length arguments
 * Inside the method accepting varargs, they are
 * treated as an array.
 * v is as an array, but ... syntax tells compiler that variable
 * number of arguments will be used and thus will be stored in
 * array and passed to by v.
 * Method can have the normal variables and varargs both
 * Normal variables need to be declared first, then the varargs the last
 */

package Ch6_Methods_Classes_Closer_Look;

public class VarArgs {

    // vaTest() uses a vararg
    static void vaTest(int... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // notice how vaTest() can be called with a variable number of args
        vaTest(10); // 1 arg
        vaTest(1, 2, 3); // 3 args
        vaTest(); // 0 args
    }

}
