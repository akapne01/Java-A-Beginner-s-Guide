package practice_tests.ch4_arrays;

import java.util.Arrays;

public class EchoFirst {
   public static void main(String[] args) {

      Arrays.sort(args);
      /**
       * BinarySearch returns and integer value, but
       * below it is assigned to String variable.
       * xNC because types are not compatible.
       */
//      String result = Arrays.binarySearch(args, args[0]);
//      System.out.println(result);
      if(10 == 10.0);
      int i = 10;
      Double d = 10.0;
      System.out.println(i == d);
//      Double r = 10;
   }
}

class TestI implements I {
   public static void main(String[] args) {
      // provides implementation for the interface inline, in that case, yes it compiles
      I i = new I(){};
   }
}

interface I {

}