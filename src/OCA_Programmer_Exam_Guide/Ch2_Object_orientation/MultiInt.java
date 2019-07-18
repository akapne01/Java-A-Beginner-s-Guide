package OCA_Programmer_Exam_Guide.Ch2_Object_orientation;

// p. 169

interface I1 {
   default int doStuff() {return 1;}
}

interface I2 {
   default int doStuff() {return 2;}
}

public class MultiInt implements I1, I2 {
   public static void main(String[] args) {
      new MultiInt().go();
   }
   void go() {
      System.out.println(doStuff());
   }
   public int doStuff() { // If this method is not public, then (xNC)
      return 3;
   }

}
