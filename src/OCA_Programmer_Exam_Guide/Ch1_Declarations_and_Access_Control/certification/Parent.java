// p. 39
package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.certification;

public class Parent {
    protected int x = 9; // protected access
    /**
     * x can be accessed by other classes inside certification package or through inheritance
     * outside package
     */

    int defaultx = 99; // Default access
}
