package OCA_Programmer_Exam_Guide.Ch2_Object_orientation.ch2_self_test;

/**
 * (6) p. 164
 * Superclass has no access to subclass methods.
 * To cast object and call method on it, need to
 * put the object with the cast in (), otherwise
 * compiler gets upset.
 */

class X { void do1() {}}
class Y extends X {void do2(){}}

class Chrome {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        /* Which code fits here and compile? */
//        x2.do2(); => (xNC) needs to be casted to Y. Superclass has no access to subclass methods.
//        (Y) x2.do2(); => (xNC) incomplete statement. when casted, method needs to be put in (),
//        before calling method on it.
        ((Y) x2).do2(); // Proper syntax for casting.
    }
}
