package OCA_Programmer_Exam_Guide.Ch3_Assignments;

// p. 190

/**
 * Assign one primitive value to another primitive value.
 */

public class ValuesTest {
   public static void main(String[] args) {
      int a = 10;
      System.out.println("a = " + a);
      int b = a;
      b = 30;
      System.out.println("a = " + a + " after changed that took place in b.");
      System.out.println("b = " + b);
   }
}
