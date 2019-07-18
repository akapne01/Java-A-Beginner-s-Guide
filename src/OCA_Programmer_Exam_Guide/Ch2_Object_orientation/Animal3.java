package OCA_Programmer_Exam_Guide.Ch2_Object_orientation;

public class Animal3 {
    String name;

    Animal3(String name) {
        this.name = name;
    }

    Animal3() {
        this(makeRandomName());
    }

    static String makeRandomName() {
        int x = (int) (Math.random() * 5);
        String name = new String[]{"Fluffy", "Fido", "Rover", "Spike", "Gigi"}[x];
        return name;
    }


    public static void main(String[] args) {
        Animal3 a = new Animal3();
        System.out.println(a.name);
        Animal3 b = new Animal3("Zeus");
        System.out.println(b.name);
    }
}
