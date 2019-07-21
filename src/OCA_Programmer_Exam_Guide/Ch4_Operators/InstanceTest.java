package OCA_Programmer_Exam_Guide.Ch4_Operators;

import com.sun.org.apache.xerces.internal.xs.StringList;

/*
 * p. 243
 */
public class InstanceTest {
    public static void main(String[] args) {
        /**
         * b and c are always false
         */
        String a = null;
        boolean b = null instanceof String;
        boolean c = a instanceof String;
        System.out.println(b + " " + c);
    }
}
