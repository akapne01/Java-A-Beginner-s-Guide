package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;
// p. 63


class Coffee2 {
    static enum CoffeeSize {BIG, HUGE, OVERWHELMING};
    private enum MyPrivateEnum{PRIVATE_MEMBER_1, PRIVATE_MEMBER_2}
    CoffeeSize size;
}

public class CoffeeTest2 {
    public static void main(String[] args) {
        Coffee2 drink = new Coffee2();
        // Class name, enum name, and constant chosen
        drink.size = Coffee2.CoffeeSize.BIG;
//        enum SomeEnum {A, B, C} ==> (xNC) enums can't be declared in the methods
    }
}
