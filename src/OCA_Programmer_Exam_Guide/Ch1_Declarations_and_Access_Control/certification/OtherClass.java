// p. 36
package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.certification;

public class OtherClass {
    void testIt() {
        // No modifier means that method has default access
        System.out.println("OtherClass");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        /**
         * Parent is in the same class as OtherClass and defaultx from the Parent class
         * has default access so it is accessible within the package, and can be used here
         * also through dot operator.
         */
        System.out.println(parent.defaultx);
    }
}
