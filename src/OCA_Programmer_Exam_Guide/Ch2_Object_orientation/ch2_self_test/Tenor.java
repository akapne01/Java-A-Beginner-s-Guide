package OCA_Programmer_Exam_Guide.Ch2_Object_orientation.ch2_self_test;

/**
 * (10) p. 166
 * For static methods the type static method applies.
 * Static methods imply that there is no object created,
 * so there is no way how JVM can imply at the runtime the
 * method based on the object itself. By definition, static
 * methods don't require an object.
 */
public class Tenor extends Singer {
    public static String sing() {return "fa";}

    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }

}

class Singer {
    public static String sing() {return "la";}
}

