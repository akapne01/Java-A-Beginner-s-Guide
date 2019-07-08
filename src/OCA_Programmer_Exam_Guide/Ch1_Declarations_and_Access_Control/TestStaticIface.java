package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;
/*
 * p. 29
 */
public class TestStaticIface implements StaticIface {
    public static void main(String[] args) {

        System.out.println(StaticIface.m1()); // ==> OK, since interface name is used

        new TestStaticIface().go();
//        System.out.println(m1()); ==> xNC because for static methods need to use interface name before method name
    }

    void go() {
        System.out.println(StaticIface.m1()); // ==> OK, interface name is used
    }
}
