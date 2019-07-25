package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

/**
 * p 316
 * Errors are unchecked, no need to declare them, but you
 * can declare them if you really want to.
 */
public class TestError {
   public static void main(String[] args) {
      badMethod();
   }

   static void badMethod() { // No need to declare error
      doStuff();
   }

   static void doStuff() { // No need to declare an error, it is unchecked
      try {
         throw new Error();
      } catch (Error me) {
         throw me;  // We catch but then rethrow it.
      }
   }
}
