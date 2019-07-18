package OCA_Programmer_Exam_Guide.Ch2_Object_orientation;

class Adder {
    public int addThem(int x, int y) {
        return x + y;
    }

    /**
     * Overload addThem method to add doubles instead of ints
     */
    public double addThem(double x, double y) {
        return x + y;
    }
}

public class TestAdder {
    public static void main(String[] args) {
        Adder a = new Adder();
        int b = 27;
        int c = 3;
        int result = a.addThem(b, c);
        double doubleResult = a.addThem(b, c);
        System.out.println(result);
        System.out.println(doubleResult);
    }

}
