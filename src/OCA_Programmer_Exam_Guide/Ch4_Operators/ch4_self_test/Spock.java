package OCA_Programmer_Exam_Guide.Ch4_Operators.ch4_self_test;

/**
 * p. 267
 * (9)
 */
public class Spock {
    public static void main(String[] args) {

        int mask = 0;
        int count = 0;

        /*
         * (5 < 7) => True
         * This means that only first check is done.
         */
        if (((5 < 7) || (++count < 10)) | mask++ < 10) {
            mask = mask + 1;
            System.out.println("true - 1");
            System.out.println("Count = " + count + " mask = " + mask);
        }

        if ((6 > 8) ^ false) {
            System.out.println("true - 2");
            mask = mask + 10;
        }

        /*
         * First one is true, so the second one is checked.
         * Second one is 1 > 1 => false, and count is incremented
         * along the way, and is now 1.
         */
        System.out.println(!(mask > 1));
        if (!(mask > 1) && ++count > 1) {
            System.out.println("true - 3");
            mask = mask + 100;
        }

        System.out.println(mask + " " + count);

    }
}
