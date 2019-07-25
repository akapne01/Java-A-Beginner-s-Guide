package OCA_Programmer_Exam_Guide.Ch4_Operators.ch4_self_test;

public class Exercise_5 {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;
        x *= x; // or x *= y
        System.out.println("x = " + x + " y = " + y);

        y *= y;
        System.out.println("x = " + x + " y = " + y);

        y *= y; //
        System.out.println("x = " + x + " y = " + y);

        x -= y;
        System.out.println("x = " + x + " y = " + y);

        System.out.println(x);
        System.out.println(y);
    }
}
