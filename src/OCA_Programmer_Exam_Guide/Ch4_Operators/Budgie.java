package OCA_Programmer_Exam_Guide.Ch4_Operators;

// p. 241

public class Budgie {
    public static void main(String[] args) {
        Budgie b1 = new Budgie();
        Budgie b2 = new Budgie();
        Budgie b3 = b1;

        String s1 = "Bob";
        String s2 = "Bob";
        String s3 = "bob";

        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
