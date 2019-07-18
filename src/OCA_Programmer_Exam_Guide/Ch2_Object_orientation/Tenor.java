package OCA_Programmer_Exam_Guide.Ch2_Object_orientation;

// p. 166

/**
 * Code is correct, but polymorphism doesn't apply to static methods.
 */

public class Tenor extends Singer {
   public static String sing() {return "fa";}
   public static void main(String[] args) {
      Tenor t = new Tenor();
      Singer s = new Tenor();
      System.out.println(t.sing() + " " + s.sing());
   }

}

class Singer {public static String sing() { return "la";}}