package WhizLabsTests.practice_3;

public class P3_56 {
   /**
    * 1) All static blocks in all the classes starting from the top.
    * 2) Then starting form the super class: Init blocks, constructor
    */
}

class MainClass {
   MainClass() {
      /** 2 */
      System.out.println("MainClass Constructor");
   }
}

class SubClass extends MainClass {
   {
      /** 3 */
      System.out.println("SubClass Init Block");
   }

   /** 1 */
   static {
      System.out.println("SubClass Static Block");
   }

   SubClass(int i) {
      this();
      /** 5 */
      System.out.println("SubClass Constructor int");
   }

   SubClass() {

      super();
      /** 4 */
      System.out.println("SubClass Constructor no arguments");
   }
}

class SubSubClass extends SubClass {
   {
      /** 6 */
      System.out.println("SubSubClass Instance Block");
   }
   SubSubClass(String s) {
      super(9);
      /** 7 */
      System.out.println("SubSubClass Constructor String");
   }

   public static void main(String[] args) {
      new SubSubClass("ABC");
   }
}
