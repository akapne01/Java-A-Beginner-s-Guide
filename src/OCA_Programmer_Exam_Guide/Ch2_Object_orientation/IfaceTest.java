package OCA_Programmer_Exam_Guide.Ch2_Object_orientation;

interface MyInterface {
   default int doStuff() {
      return 42;
   }
}

interface MySecondOne {
   default int doStuff() {
      return 40;
   }
}

public class IfaceTest implements MyInterface, MySecondOne {
   public static void main(String[] args) {
      new IfaceTest().go();
   }

   void go() {
      System.out.println(doStuff());
      System.out.println(MyInterface.super.doStuff());
      System.out.println(doStuff());
      System.out.println(MySecondOne.super.doStuff());
   }

   public int doStuff() {
      return 43;
   }
}
