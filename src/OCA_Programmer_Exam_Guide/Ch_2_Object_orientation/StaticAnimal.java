package OCA_Programmer_Exam_Guide.Ch_2_Object_orientation;
// p. 154
public class StaticAnimal {
    static int type;
    static void doStuff() {
        System.out.println("Static Animal");
    }
    void printStuff() {
        System.out.println("Heyaa");
    }
}

class StaticDog extends StaticAnimal {
    static void inheritanceCheck() {
        doStuff();
    }

    public int IntTest() {
       printStuff();
        return (9 / 5);

    }

    public static void main(String[] args) {
        doStuff();
        StaticDog.doStuff();
        type = 9;
        System.out.println(type);
        System.out.println(9/5);
        new StaticDog().IntTest();
    }




}
