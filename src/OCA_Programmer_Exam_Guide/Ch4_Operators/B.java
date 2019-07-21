package OCA_Programmer_Exam_Guide.Ch4_Operators;

/**
 * p. 242
 * Checks if downcast is possible.
 * If the object referring to the
 * superclass reference variable is
 * the subclass object or even subclass
 * of the subclass. In both cases the
 * cast is possible and will not cause
 * a compilation error.
 */
class A {
}

public class B extends A {
    public static void main(String[] args) {
        A myA = new B();
        m2(myA);

        B b = new B();
        if (b instanceof Object) {
            System.out.println("b is definitely an Object");
        }
    }

    public static void m2(A a) {
        /**
         * This if statement protects from compilation
         * errors by trying to do something stupid and
         * cast A to B, which would fail.
         */
        if (a instanceof B) {
            ((B) a).doStuff();
        }
    }

    public static void doStuff() {
        System.out.println("'a' refers to B");
    }
}
