package OCA_Programmer_Exam_Guide.Ch3_Assignments;
// p. 203

import java.awt.Dimension;

public class ReferenceTest {
    public static void main(String[] args) {
        Dimension a1 = new Dimension(5, 10);
        System.out.println("a1.height = " + a1.height);

        Dimension b1 = a1;
        b1.height = 30;
        System.out.println("a1.height = " + a1.height + " after change to b1");

        Dimension d = new Dimension(5, 10);
        ReferenceTest rt = new ReferenceTest();
        System.out.println("Before, d.height: " + d.height);

        rt.modify(d);
        System.out.println("After, d.height: " + d.height);

        /**
         * Primitive values reference test.
         */
        int a = 1;
        ReferenceTest rt2 = new ReferenceTest();
        System.out.println("Before modify() a = " + a);
        rt2.modify(a);
        System.out.println("After modify() a = " + a);
    }

    void modify(Dimension dim) {
        dim.height = dim.height + 1;
        System.out.println("dim = " + dim.height);
    }

    void modify(int number) {
        number = number + 1;
        System.out.println("number = " + number);
    }

}
