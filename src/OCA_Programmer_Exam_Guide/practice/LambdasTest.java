package OCA_Programmer_Exam_Guide.practice;

import java.util.function.Predicate;
import static java.lang.Math.*;
import static java.lang.System.out;


public class LambdasTest {
    static boolean b;

    public static void main(String[] args) {
        LambdasTest s = new LambdasTest();
        /**
         * x and y are not used in any of the below expressions so
         * they will always return constant value and that constant
         * value is expression value itself
         */
        s.go(x -> mult(5, 1) < 7); // Always return true
        s.go(x -> b = new Boolean(true)); // Always return true
        s.go(y -> {
            return mult(3, 2) < 4; // Always return false
        });

        pow(1, 2);
        abs(1);
        out.println();

    }

    void go(Predicate<LambdasTest> e) {
        LambdasTest s2 = new LambdasTest();
        if (e.test(s2)) {
            System.out.println("true ");
        } else {
            System.out.println("false ");
        }
    }

    static int mult(int x, int y) {
        return x * y;
    }


}