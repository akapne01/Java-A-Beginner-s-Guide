package OCA_Programmer_Exam_Guide.Ch4_Operators.ch4_self_test;

/**
 * p. 267
 * (8)
 */
public class SpecialOps {
    public static void main(String[] args) {
        String s = "";
        boolean b1 = true;
        boolean b2 = false;

        /** First operand sets b2 false, so it is false, and next one is evaluated.
         * 21 % 5 = 1 and 1 is not bigger than 2, so the result is false. X is not printed  */
        if ((b2 = false) | (21 % 5) > 2) s += "x";
        System.out.println((b1 = false));

        /** Because b1 == true, the b2 is not set to true, not evaluated. Y is printed*/
        if (b1 || (b2 = true)) s += "y";

        /** Because b2 was not previously set to true, because of the short circuit, it is
         * still false. Z is not printed. */
        if (b2 == true) s += "z";

        System.out.println(s);
    }
}
