package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

public class Vararge {

    // Leal var-arg declarations
    void doStaff(int... x) {}
    void doStuff2(char c, int ...x) {}
    void doStuff3(Animal ... animal) {}

    // Illegal declarations
//    void doStuff4(int x...) {} // incorrect syntax
//    void doStuff5(int... x, char... y) {} // can only be 1 vararg
//    void doStuff6(String... s,byte b ) {} // var-arg has to be the last parameter in the signature
}
