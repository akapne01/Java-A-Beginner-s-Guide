package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;
// p. 63

enum CoffeeSize {BIG, HUGE, OVERWHELMING}

class Coffee {
    CoffeeSize size;
}
public class CoffeeTest1 {
    public static void main(String[] args) {
        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG;
    }
}
