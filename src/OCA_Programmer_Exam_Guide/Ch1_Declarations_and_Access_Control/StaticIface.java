package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;
/*
 * p 29
 */
public interface StaticIface {
    static int m1() { return 42;}
    public static void m2() {;}
//    final static void m3() {;} ==> xNC because of final
//    abstract static void m4() {;} ==> xNC because abstract
//    static void m5(); ==> xNC because need method body
}
