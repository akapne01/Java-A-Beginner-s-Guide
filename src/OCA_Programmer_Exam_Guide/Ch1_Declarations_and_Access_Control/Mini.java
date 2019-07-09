package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

// p 46.
public class Mini extends Car {
    public void goUpHill() {
        // Mini-specific going uphill code
        System.out.println("Going uphill - Mini");
    }
}

class MiniTestDrive {
    public static void main(String[] args) {
        Mini mini = new Mini();
        // Calling the method from Abstract Class
        System.out.println(mini.getType());

        // Calling method from Car
        mini.doCarThings();

        // Calling method from Mini
        mini.goUpHill();
    }


}
