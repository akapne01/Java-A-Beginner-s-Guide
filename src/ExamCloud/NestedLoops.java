package ExamCloud;

public class NestedLoops {

   public static void main(String[] args) {

      /**
       * Throws RuntimeException : NegativeArraySizeException
       */
      int arr[] = new int[-2];

      /**
       * Float compiles fine if has no decimal. If decimal, needs to
       * have f next to the number to cast
       */
      float i = 3;
      float j = 3;
      double z1 = i+j;
      float z2 = i+j;

      /**
       * Throws RuntimeException: NumberFormatException as string
       * "808.1" can't be parsed to Integer.
       */
      Integer n = Integer.valueOf("808.1");


   outer: for (int x=0; x <2; x++) {
      middle:
      for (int y = 0; y < 2; y++) {
         for (int z = 0; z < 2; z++) {
            if (y == x) {
               System.out.println("x= "+ x + " y="+y+" z= " + z );
               break middle;
            }
         }
      }

   }
}}
