package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;
// p. 64
// Conceptual example of how can you think about enums
class CoffeeSize2 {
    String name;
    int count;

    CoffeeSize2(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static final CoffeeSize2 BIG = new CoffeeSize2("BIG", 0);
    public static final CoffeeSize2 HUDGE = new CoffeeSize2("HUGE", 1);
    public static final CoffeeSize2 OVERWHEALMING = new CoffeeSize2("OVERWHELMING", 2);
}
