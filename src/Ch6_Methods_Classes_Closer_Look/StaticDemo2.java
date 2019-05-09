/*
 * p. 212
 * Use of the static method
 * Static method is different from usual class method.
 * If usual methods are called on the class object, then
 * static methods are called using className.methodName()
 * For example, Math.sqrt() is a static method from the Math
 * class
 *
 * Static methods have following restrictions:
 *  a) Only call other static methods in their class
 *  b) Can directly access only static variables in their class
 *  c) Don't have !*this* reference
 */

package Ch6_Methods_Classes_Closer_Look;

class StaticMethod {
    static int val =1024; // a static variable

    // a static method
    static int valDiv2() {
        return val/2;
    }
}

public class StaticDemo2 {
    public static void main(String[] args) {
        System.out.println("val is " + StaticMethod.val);
        System.out.println("StaticMethod.valDiv2(): " + StaticMethod.valDiv2());

        StaticMethod.val = 4;
        System.out.println("val is " + StaticMethod.val);
        System.out.println("StaticMethod.valDiv2(): " + StaticMethod.valDiv2());
    }
}
