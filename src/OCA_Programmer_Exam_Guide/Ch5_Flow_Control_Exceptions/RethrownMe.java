package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

import java.io.IOException;

/**
 * p. 317
 * If exception is rethrown
 */
public class RethrownMe {

   public void doStuff() throws IOException {
      try {
         // risky code
         throw new IOException();
      } catch (IOException ex) {
         // can't handle it
         throw ex; // can't throw unless you declare it
      }
   }
}
