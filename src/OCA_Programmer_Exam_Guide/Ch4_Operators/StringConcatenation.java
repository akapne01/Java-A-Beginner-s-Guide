package OCA_Programmer_Exam_Guide.Ch4_Operators;

public class StringConcatenation {
    public static void main(String[] args) {

        // String concatenation
        System.out.println("Using +");
        String a = "String";
        int b = 3;
        int c = 7;
        System.out.println(a + b + c);
        System.out.println(a + (b + c));

        // Compound operator +=
        /**
         * Even if integer numbers are added to the string,
         * using compound operator +=, they are automatically
         * converted to String.
         */
        int add = 9999;
        System.out.println("\nUsing compound operator");
        String s = "123";
        s += "45";
        s += 67;
        s += add;
        s = s + add;
        System.out.println(s);
    }
}
