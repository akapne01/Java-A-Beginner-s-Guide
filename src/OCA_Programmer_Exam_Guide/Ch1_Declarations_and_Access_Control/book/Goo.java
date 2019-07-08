/*
 * p. 33
 */
package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.book;
import OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.cert.*; // Import all clases in the cert package

class Goo {
    public static void main(String[] args) {
        /**
         * Sludge imported from cert package. Can see the class, because it has public access modifier.
         * Can call the method, because the method has public access modifier.
         */
        Sludge o = new Sludge();
        o.testIt();
    }
}
