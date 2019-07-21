package OCA_Programmer_Exam_Guide.Ch4_Operators;

// p. 241

public class EnumEqual {

    enum Color {RED, BLUE}

    public static void main(String[] args) {

        Color c1 = Color.RED;
        Color c2 = Color.RED;

        if (c1 == c2) {
            System.out.println(" == ");
        }

        if (c1.equals(c2)) {
            System.out.println("dot equals");
        }

    }
}
