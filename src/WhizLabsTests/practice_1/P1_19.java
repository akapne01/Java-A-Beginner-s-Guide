package WhizLabsTests.practice_1;

public class P1_19 {

   /**
    * Prints main 2.
    * Got confused with the main 1 as for some
    * reason didn't notice that data types are
    * different.
    */
   public static void main(int [] i) {
      System.out.println("main 1");
   }

   public static void main(String... c) {
      System.out.println("main 2");
   }

   public static void main(String c) {
      System.out.println("main 3");
   }
}
