package OCA_Programmer_Exam_Guide.Ch6_Strings_Arrays_Lists_Dates_Lamndas;

/**
 * p. 389
 * Advanced encapsulation
 */

class Special {
   private StringBuilder s = new StringBuilder("bob");

   StringBuilder getName() {
      return s;
   }

   void printName() {
      System.out.println(s);
   }
}

public class TestSpecial {

   public static void main(String[] args) {
      Special sp = new Special();
      StringBuilder s2 = sp.getName();
      s2.append("fred");
      System.out.println(s2);
      sp.printName();
      System.out.println(sp.getName() == s2);
      System.out.println(sp.getName().hashCode());
      System.out.println(s2.hashCode());
   }
}
