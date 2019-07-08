// p. 42
package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.certification;

// Same package
class Child extends Parent {
    static public void main(String[] args) {
        Child sc = new Child();
        sc.testIt();
    }

    // Default members can be accessed in the same package
    public void testIt() {
        System.out.println("Variable defaultx is " + defaultx);
    }
}
