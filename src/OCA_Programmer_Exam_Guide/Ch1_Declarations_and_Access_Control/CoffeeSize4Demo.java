package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

enum CoffeeSize4 {
    // 8, 10, 16 are passed to constructor. Enum declaration
    BIG(8),
    HUGE(10),
    OVERWHELMING(16) {
        public String getLidCode() { // overrides the method for this particular constant
            return "A";
        }
    };

    // Constructor
    CoffeeSize4(int ounces) {
        this.ounces = ounces;
    }

    // An instance variable
    private int ounces;

    // Method to get ounces
    public int getOunces() {
        return ounces;
    }

    public String getLidCode() {
        return "B";
    }
}

public class CoffeeSize4Demo {
    CoffeeSize4 size;

    public static void main(String[] args) {
        CoffeeSize4Demo drink1 = new CoffeeSize4Demo();
        drink1.size = CoffeeSize4.BIG;

        CoffeeSize4Demo drink2 = new CoffeeSize4Demo();
        drink2.size = CoffeeSize4.OVERWHELMING;

        System.out.println(drink1.size.getOunces()); // prints 8

        for (CoffeeSize4 cs : CoffeeSize4.values())
            System.out.println(cs + " " + cs.getLidCode());

    }
}
