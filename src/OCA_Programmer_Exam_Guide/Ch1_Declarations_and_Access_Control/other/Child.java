package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.other;
// p. 39

import OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.certification.Parent;

class Child extends Parent {
    public void testIt() {
        /**
         * Parent is in the different package and x is a protected member.
         * x can be accessed through inheritance.
         */
        System.out.println("x is " + x);
        System.out.println("x is " + this.x);
        Parent p = new Parent();
//        System.out.println("X in parent is " + p.x); ==> (xNC) Because Parent class is in the different
        // package and x is protected. It can only be accessed through inheritance and not through (.) a dot
        // operator.

//        System.out.println("default x = " + this.defaultx); ==> (xNC) Default members are not inherited and
//          accessible outside their package
    }

    public final static void main(String[] args) {
        Child ch = new Child();
        ch.testIt();
    }
}
