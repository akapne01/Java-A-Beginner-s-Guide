package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

/**
 * p. 287
 * <p>
 * Executed at least once.
 */
public class DoWhileLoop {
   public static void main(String[] args) {

      /**
       * Executed at least once.
       */
      do {
         System.out.println("Inside the loop");
      } while (false);

      int x = 1;
//      while(x) {} // xNC not a boolean
//      while (x = 5) {} // xNC not a boolean, assignment
//      while (x == 5) {} // legal, but not executed
//      while (true) {} // legal, but infinite loop
   }
}
