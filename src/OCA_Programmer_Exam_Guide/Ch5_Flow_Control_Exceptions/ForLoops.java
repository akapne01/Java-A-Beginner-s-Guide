package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

import sun.reflect.generics.scope.Scope;

/**
 * p. 287
 */
public class ForLoops {
   public static void main(String[] args) {

      /**
       * Can declare more that 1 loop variable
       */
      for (int x = 10, y = 3; y > 3; y++) {

      }

      /**
       * Scope
       */
      for (int x = 0; x < 2; x++) {
         System.out.println(x); // legal
      }
//      System.out.println(x); // xNC, x is out of scope here

      int y = 3;
      for (int x = 0; ((((x < 10) && (y-- > 2)) | x == 3)); x++) {
      }

//      for (int x = 0; (x >5), (y<2); x++) { } => xNC Only 1 boolean expression allowed

      doStuff();

      /**
       * 2 loop vars
       */
      for (int i = 0, j = 0; (i < 10) && (j < 10); i++, j++) {
         System.out.println("i is " + i + " j is " + j);
      }

      /**
       * Iterator expression can be anything
       * Prints iterate 2x
       */
      int b = 3;
      for (int a = 1; b != 1; System.out.println("iterate")) {
         b = b - a;
      }

      for (int i = 0; i <2;doStuff()) {
         System.out.println("do-stuff for");
         i++;
      }
   }

   static boolean doStuff() {
      for (int x = 0; x < 3; x++) {
         System.out.println("in for loop");
         return true;
      }
      return true;
   }
}
