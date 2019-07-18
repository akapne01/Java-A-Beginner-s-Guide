package OCA_Programmer_Exam_Guide.Ch3_Assignments;

// p. 201

public class TestLocal {

   public static void main(String[] args) {
      int x;
      // Throws array out of bounds exception, because of args[0].
//      if (args[0] != null) {
//         x = 7;
//      }

      /**
       * Compiler knows that in case is statement is false and initialization might
       * not happen, therefore, compilation fails.
       *
       * Because of compiler can't-tell-for-certain problem, you might sometimes
       * need to initialize your variables outside the conditional block, just to
       * make compiler happy.
       * When compiler is not happy, ain't nobody happy.
       */
//      int y = x; => (xNC)
   }
}
