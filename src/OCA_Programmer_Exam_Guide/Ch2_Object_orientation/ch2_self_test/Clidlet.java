package OCA_Programmer_Exam_Guide.Ch2_Object_orientation.ch2_self_test;
/**
 * (3)
 * Although a final method can't be overriden,
 * in this case, the method is private, therefore,
 * hidden.
 *
 * The effect is that new, accessible, method
 * flipper is created.
 *
 * Therefore, no polymorphism occurs in this example.
 */

class Clidder {
    private final void flipper() {
        System.out.println("Clidder");
    }
}

public class Clidlet extends Clidder {
    public final void flipper() {
        System.out.println("Clidlet");
    }

    public static void main(String[] args) {
        new Clidlet().flipper();
    }
}
