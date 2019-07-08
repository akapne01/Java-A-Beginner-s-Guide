package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.notcert;

import OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.cert.Roo;

class UseARoo {
    public void testIt() {
        Roo r = new Roo(); // This is ok, because Roo is a public class
//        System.out.println(r.doRooThingsPrivately());  ==> Doesn't compile! doRooThingsPrivately is only visible
        // in the Roo class itself, because it has private access modifier.
    }
}
