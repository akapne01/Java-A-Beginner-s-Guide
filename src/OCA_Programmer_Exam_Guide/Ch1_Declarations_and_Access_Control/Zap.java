package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

public class Zap implements Foo {
    public void go() {
        System.out.println("Let's go!");
//        BAR = 72; ==> xNC because interface constants are implicitly public static final
    }

    public static void main(String[] args) {
        System.out.println(BAR);
        new Zap().go();
    }
}
