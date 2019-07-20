package OCA_Programmer_Exam_Guide.Ch2_Object_orientation.ch2_self_test;

/**
 * (5) p. 164
 *
 * Order:
 * (1) All the static blocks run.
 * Start running from the Superclass to child classes.
 * (2) Prints out all "pre" from the main method.
 * (3) Then intit blocks run right after the call to superclass.
 * All the superclass init blocks run first, then the constructor
 * completes.
 * (4) Then "hawk" printed in the main method after the object
 * has been created.
 */
class Bird {

    // (6th)
    /** Init block 1 */
    {
        System.out.println("Bird_init_block_1 ");
    }

    // (7th)
    /** Constructor */
    public Bird() {
        System.out.println("Bird_constructor");
    }

    // (1st)
    static {
        System.out.println("Bird_Loaded_Static_1");
    }
}

class Raptor extends Bird {

    // (2nd)
    /** Static block 1 (When Class loads) */
    static {
        System.out.println("Raptor_Static_Block_1");
    }

    // (9th)
    /** Constructor */
    public Raptor() { // Constructor
        System.out.println("Raptor_Constructor");
    }

    // (8th)
    /** Init block (After return from super() in constructor) */
    { // init block
        System.out.println("Raptor_init_block");
    }

    // (3rd)
    /** Static block 2 */
    static { // static block 2
        System.out.println("Raptor_Static_Block_2");
    }

    // (4th)
    static {
        System.out.println("Raptor_Loaded_Static_3");
    }

}
public class Hawk extends Raptor {
    public static void main(String[] args) {
        System.out.println("pre_Hawk_Created "); // (5th)
        new Hawk();
        System.out.println("After_Hawk_Created"); // (10th)
    }
}
