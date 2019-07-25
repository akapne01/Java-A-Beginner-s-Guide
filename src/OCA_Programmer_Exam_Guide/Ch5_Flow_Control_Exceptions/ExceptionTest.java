package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

import java.io.EOFException;

/**
 * p. 313
 *
 */
public class ExceptionTest {
   public int myMethod1() throws EOFException {
      return myMethod2();
   }

   public int myMethod2() throws EOFException {
      // code that actually could throw the exception go here
      return 1;
   }

}
