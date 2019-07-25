package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

import java.io.IOException;

/**
 * p. 313
 */
public class ExceptionTrowing {

   /**
    * doMore method is throwing an exception. Because duStuff() is calling it, it has
    * 2 options now to deal with this situation:
    * 1) Either declare in the method signature that it throws the same exception as doMore()
    * 2) Or use try and catch statements around the method.
    */
   void doStuff1() throws IOException {
      doMore();
   }

   void doStuff2() {
      try {
         doMore();
      } catch (IOException e) {
         System.err.println("Exception caught!");
      }
   }

   /**
    * If doMore() manually throws IOException, it should be declared in the method signature.
    * If not declared, it will not compile.
    */
   void doMore() throws IOException {
      throw new IOException();
   }
}
