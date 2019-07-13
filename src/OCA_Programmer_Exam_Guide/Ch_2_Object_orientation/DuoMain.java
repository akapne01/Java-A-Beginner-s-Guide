package OCA_Programmer_Exam_Guide.Ch_2_Object_orientation;
// p. 115

/**
 * Overloading the main method.
 */
public class DuoMain {
    public static void main(String[] args) {
        main(1);
    }

    static void main(int i) {
        System.out.println("Overloaded main.");
    }
}
