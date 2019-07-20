package OCA_Programmer_Exam_Guide.Ch2_Object_orientation.ch2_self_test;

/**
 * (15) p. 169
 *
 */

interface I1 {
    default int doStuff() { return 1;}
}

interface I2 {
    default int doStuff() { return 2;}
}

public class MultiInt implements I1, I2 {
    public static void main(String[] args) {
        new MultiInt().doStuff();
    }
    void go() {
        System.out.println(doStuff());
    }

    /**
     * If this method is missing the public access modifier, it
     * will not compile.
     */
    public int doStuff() {
        return 3;
    }
}
