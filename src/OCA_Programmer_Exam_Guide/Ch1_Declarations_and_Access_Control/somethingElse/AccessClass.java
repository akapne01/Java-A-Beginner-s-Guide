// p. 37
package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.somethingElse;
import OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control.certification.OtherClass;

class AccessClass {
    static public void main(String[] args) {
        OtherClass o = new OtherClass();
//        o.testIt(); ===> (xNC) asa testIt() has default access modifier and is in the different package.
    }
}
