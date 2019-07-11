package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

/**
 * p. 82 Self test 1-10.
 */

interface Gadget {
   void doStuff();
}

abstract class Electronic {
   void getPower() {
      System.out.print("plug in");
   }
}

public class Tablet extends Electronic implements Gadget {
   /**
    * All methods that are overridden from Interface, must be PUBLIC!!!
    */
   public void doStuff() {
      System.out.print("show book ");
   }

   public static void main(String[] args) {
      new Tablet() . getPower();
      new Tablet() . doStuff();
   }
}
