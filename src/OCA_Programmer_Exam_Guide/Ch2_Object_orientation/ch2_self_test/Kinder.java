package OCA_Programmer_Exam_Guide.Ch2_Object_orientation.ch2_self_test;

/**
 * (4) p. 163
 */
class AgedP {
    AgedP() {
    }

    public AgedP(int c) {
//         this(); => (xNC), compiles, but redundant.
    }
}

public class Kinder extends AgedP {
    public Kinder(int x) {
        super();
    }

}

