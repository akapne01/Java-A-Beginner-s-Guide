package OCA_Programmer_Exam_Guide.Ch2_Object_orientation.ch2_self_test;

/**
 * (9) p. 166
 * First line in method go2 throws an Exception,
 * because we are assigning to the child class
 * reference a super class and attempting to cast
 * superclass to the child class. This can only
 * be done, if the actual child class object is
 * referring to the super class reference variable.
 *
 * Subclass might have methods that superclass doesn't
 * so it is much wider. And smaller thing cannot be
 * really made much wider in this case, unless it is
 * already wide enough, but narrowed to fit the
 * superclass box.
 */
public class Redwood extends Tree {
    public static void main(String[] args) {
        new Redwood().go();
    }

    void go() {
        go2(new Tree(), new Redwood());
        go2((Redwood) new Tree(), new Redwood());

    }

    void go2(Tree t1, Redwood r1) {
        Redwood r2 = (Redwood) t1;
        Tree t2 = (Tree) r1;
    }
}

class Tree {}
