package OCA_Programmer_Exam_Guide.Ch4_Operators;

/**
 * p. 245
 * Modulus operator
 */
public class MathTest {
    public static void main(String[] args) {

        int x = 15;
        int y = x % 4;
        System.out.println("The test result of 15 % 4 is the " +
                "remainder of 15 divided by 4. The reminder is " + y);

        for (int i = 0; i <= 30; i++) {
            System.out.println(i + " % 15 = " + (i % 15));
        }
    }
}
