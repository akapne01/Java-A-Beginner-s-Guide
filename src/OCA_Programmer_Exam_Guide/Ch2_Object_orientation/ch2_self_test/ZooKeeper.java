package OCA_Programmer_Exam_Guide.Ch2_Object_orientation.ch2_self_test;

/**
 * (13) p. 168
 * Polymorphism applies to methods, not to instance
 * variables.
 * JVM will assign the method based on the object
 * itself at runtime, but the same doesn't apply
 * to instance variables. Instance variables are
 * assigned based on the reference variable type.
 *
 * Prints: furry bray
 */

class Mammal{
    String name = "furry ";
    String makeNoise() {return "generic noise";}
}

class Zebra extends Mammal {
    String name = "stripes ";
    String makeNoise() {return "bray";}
}

public class ZooKeeper {
    public static void main(String[] args) {
        new ZooKeeper().go();
    }

    void go() {
        Mammal m = new Zebra();
        System.out.println(m.name + m.makeNoise());
    }
}
