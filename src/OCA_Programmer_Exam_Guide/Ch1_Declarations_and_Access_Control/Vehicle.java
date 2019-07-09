package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

// p. 46
public abstract class Vehicle {
    private String type;

    // Abstract method
    public abstract void goUpHill();

    // Non-abstract method
    public String getType() {
        return type;
    }
}
