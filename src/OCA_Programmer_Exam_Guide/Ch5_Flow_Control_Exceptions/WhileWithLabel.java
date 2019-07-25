package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

/**
 * p. 297
 * Exercise 5-2
 */
public class WhileWithLabel {
   public static void main(String[] args) {
      int age = 0;
      outer:
      while (age <= 21) {
         age++;

         if (age == 16) {
            System.out.println("Get your driver's license");
            continue outer;
         }
         System.out.println("Another year");
      }
   }
}
