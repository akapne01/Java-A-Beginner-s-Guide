package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.cert;

class Cloo extends Roo {
    public void testCloo() {
//        System.out.println(doRooThingsPrivately()); ==> Cloo is a subclass of Roo and both are in the same package.
        // However, Cloo doesn't have access to Roo's private methods.  (xNC)
    }
}
