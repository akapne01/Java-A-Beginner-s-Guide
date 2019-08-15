package WhizLabsTests.practice_1;

public class P1_63 {
   /**
    * sup subsub  printed
    * Because Sub1 class is redundant here and SubSub1
    * only extends Sup1.
    */
}

class Sup1 {
   String s = "";

   Sup1() {
      s += "sup ";
   }
}

class Sub1 extends Sup1 {
   Sub1() {
      s += "sub ";
   }
}

class SubSub1 extends Sup1 {
   SubSub1() {
      s += "subsub ";
   }

   public static void main(String[] args) {
      System.out.println(new SubSub1().s);
   }
}