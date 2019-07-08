// p. 34
package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.notcert;

import OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.cert.Roo;

class Cloo extends Roo {
    public void testCloo() {
        /**
         * Both below method calls mean exactly the same, because all inherited methods are implicitly
         * using this.methodName(). This refers to the currently executing object.
         */
        System.out.println(doRooThings());
        System.out.println(this.doRooThings());
    }
}
