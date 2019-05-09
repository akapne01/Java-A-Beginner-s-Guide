/*
 * p. 222
 * Use varargs with normal arguments.
 * Normal arguments have to be defined first and only after varags
 */

package Ch6_Methods_Classes_Closer_Look;

public class VarArgs2 {
    // Here, msg is a normal parameter an v is a varargs parameter.
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}
