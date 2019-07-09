package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;
// p 46
public abstract class Car extends Vehicle {
    // still abstract method
    public abstract void goUpHill();

    public void doCarThings() {
        // special car code goes here
        System.out.println("Do car things method declared on Car class");
    }
}
