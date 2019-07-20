package OCA_Programmer_Exam_Guide.Ch3_Assignments;

// p. 203
public class StringTest {
    public static void main(String[] args) {

        /**
         * For strings, changing value of one,
         * doesn't not change the
         * value of the other one.
         */
        String x = "Java";
        String y = x;

        System.out.println("y string = " + y);
        x = x + " Bean";
        System.out.println("y string = " + y);

        String so = new String("Java");
        String yo = so;

        System.out.println("yo string = " + yo);
        so = so + " Bean";
        System.out.println("yo string = " + yo);

    }
}
