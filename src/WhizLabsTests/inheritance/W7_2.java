package WhizLabsTests.inheritance;

public class W7_2 {
   public static void main(String[] args) {
//      I i = new I()[];
//      System.out.println(I.x + i.getValue() + "" + i);
   }
}

interface I {
   int x = 10;

   public default void method() {

   }

   public default int getValue() {
      return 5;
   }

   /**
    * Default interface methods can't override Object class methods.
    */
//   public default String toString() {
//      return "I";
//   }
}
