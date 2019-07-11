package Ch14_Lambda_Expressions_Method_References;

import java.io.IOException;
import java.io.Reader;

/**
 * p. 508
 * If lambda expression throws a checked expression then that exception must be compatible
 * with the exceptions listed in the throws clause of the abstract method in the functional
 * interface.
 */

interface MyIOAction {
   /**
    * If this abstract method does not throw IOException, code will not compile in
    * LambdaExceptionsDemo.
    */
   boolean ioAction(Reader rdr) throws IOException;
}

public class LambdaExceptionDemo {
   public static void main(String[] args) {

      /**
       * This block lambda can throw an IOException.
       * Thus, IOException must be specified in a throws
       * clause of ioAction() in MyIQAction.
       */
      MyIOAction myIO = (rdr) -> {
         int ch = rdr.read(); // This lambda might throw an exception
         // ...
         return true;
      };
   }
}
