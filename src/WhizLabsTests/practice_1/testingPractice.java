package WhizLabsTests.practice_1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

public class testingPractice implements Move {
   final int i = 9;

   public static void main(String[] args) {

//      Arrays.sort("n", "l", "L");
      Double d1 = 10.0/0.0; // Infinity
      System.out.println(d1);
      int a[] = {1,2};
      int b[] = {1,2};
      int c[][] = {{1},{2}};
      int d[][] = {{1},{2}};
      Integer e[] = {1,2};
      Integer f[] = {1,2};
      System.out.println(a.equals(b));
      System.out.println(a == b);
      System.out.println(Arrays.equals(a, b));
      System.out.println(Arrays.deepEquals(c, d));
      System.out.println("Arrays.deepEquals(e, f) " + Arrays.deepEquals(e, f));


      System.out.println("Integer array");
      Integer[] ai = new Integer[2];
      ai[1] = 10;
      /** Prints null, no exception thrown */
      for (Integer I : ai) {
         System.out.println(I);
      }

      /** Throws null pointer exception */
//      for (int I : ai) {
//         System.out.println(I);
//      }

      System.out.println("int array");
      int[] aj = new int[2];
      aj[1] = 10;

      /** Prints 0 and 10 */
      for (Integer I : aj) {
         System.out.println(I);
      }

      /** Prints 0 and 10 */
      for (int I : aj) {
         System.out.println(I);
      }


   }

   public static IOException method() {
      return new IOException();
   }

   public static void method2() throws IOException {
      throw new FileNotFoundException();
   }

}

interface Move {
   public static void main(String[] args) {
      System.out.println("main");
   }
}

class Sup {
   String s = "";
   Sup() {
      s += "sup ";
   }

}

class Sub extends  Sup {

   Sub() {
      s += "sub";
   }
   public static void main(String[] args) {
      System.out.println("Interesting usage of inheritance polymorphism");
      /**
       * Prints sup sub
       * If s is not initialized in Sup, will print
       * nullsup sub, as we are adding to the String.
       */
      System.out.println(new Sub().s);

      String s2 = "";
      s2.concat("a");
      System.out.println(s2);


   }
}
