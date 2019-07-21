package OCA_Programmer_Exam_Guide.Ch4_Operators;

/**
 * p. 252
 * Short-circuit Logical Operations
 */
public class Logical {
    public static void main(String[] args) {
        boolean b1 = false, b2 = false;
        boolean b3 = (b1 == true) && (b3 = true); //  will b2 be set to true?
        System.out.println((b3 + " " + b2));
    }
}
