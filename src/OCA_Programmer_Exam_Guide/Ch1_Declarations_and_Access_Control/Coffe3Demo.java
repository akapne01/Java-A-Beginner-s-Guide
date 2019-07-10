package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

enum CoffeeSize3 {
    // 8, 10, 16 are passed to constructor. Enum declaration
    BIG(8), HUGE(10), OVERWHELMING(16);

    // Constructor
    CoffeeSize3(int ounces) {
        this.ounces = ounces;
    }

    // An instance variable
    private int ounces;

    // Method to get ounces
    public int getOunces() {
        return ounces;
    }
}

public class Coffe3Demo {
    CoffeeSize3 size;

    public static void main(String[] args) {
        Coffe3Demo drink1 = new Coffe3Demo();
        drink1.size = CoffeeSize3.BIG;

        Coffe3Demo drink2 = new Coffe3Demo();
        drink2.size = CoffeeSize3.OVERWHELMING;

        System.out.println(drink1.size.getOunces()); // prints 8

        for (CoffeeSize3 cs : CoffeeSize3.values())
            System.out.println(cs + " " + cs.getOunces());

    }
}
