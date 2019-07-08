// p. 34
package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.notcert;

/**
 * Toon has no problem accessing Cloo, because Cloo is in the same package, and public
 */
public class Toon {
    public static void main(String[] args) {
        Cloo c = new Cloo();
        System.out.println(c.doRooThings());
        System.out.println();
        c.testCloo();
    }
}
