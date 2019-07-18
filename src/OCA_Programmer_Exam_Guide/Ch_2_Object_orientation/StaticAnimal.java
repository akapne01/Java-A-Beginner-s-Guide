package OCA_Programmer_Exam_Guide.Ch_2_Object_orientation;
// p. 154
public class StaticAnimal {
    static void doStuff() {
        System.out.println("Static Animal");
    }
}

class StaticDog extends StaticAnimal {
    static void inheritanceCheck() {
        doStuff();
    }
    public static void main(String[] args) {
        doStuff();
        StaticDog.doStuff();
    }
}
