package WhizLabsTests.practice_1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class P1_8 {

   public static void main(String[] args) {

      try {
         throw method();
      } catch (IOException e) {
         System.out.println("caught");
      }
   }

   public static IOException method(){
      /**
       * There is no way FileNotFoundException can be thrown by the try block.
       * Compiler sees that. Catch block becomes unreachable code. Code fails
       * to compile.
       */
//      try {
         return new IOException();
//      } catch (FileNotFoundException e) {
//         return new FileNotFoundException();
//      }
   }
}
