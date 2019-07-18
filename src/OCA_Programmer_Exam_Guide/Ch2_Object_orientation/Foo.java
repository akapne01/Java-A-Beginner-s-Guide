package OCA_Programmer_Exam_Guide.Ch2_Object_orientation;

import java.io.IOException;

public class Foo {
    public void doStuff(int y, String s) {
    }

    public void moreThings(int x) {
    }
}

class Bar extends Foo {
    /**
     * This is a method overload so IOException is perfectly fine.
     */
    public void doStuff(int y, long s) throws IOException {
    }

    /**
     * This method is overloaded and not overridden.
     */
    public void moreThings(String s) {

    }
}

