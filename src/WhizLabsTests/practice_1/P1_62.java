package WhizLabsTests.practice_1;

public class P1_62 {

   public static void main(String[] args) {

      Employer p = new Employer("Livera", 22);
      System.out.print(p.age+" ");
      updateAge(p, 30);
      System.out.print(p.age);
   }

   /**
    * ps object is passed by reference so actual changes
    * will affect the object itself.
    * Changes the variable age of the object.
    */
   public static void updateAge(Employer ps, int a) {
      ps.age = a;
   }
}

class Employer {
   Employer(String s, int i) {
      name = s;
      age = i;
   }

   String name;
   int age;
}

