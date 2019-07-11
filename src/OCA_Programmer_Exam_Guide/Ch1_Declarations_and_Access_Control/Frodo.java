package OCA_Programmer_Exam_Guide.Ch1_Declarations_and_Access_Control;

/**
 * P. 82. Self test number 9.
 */
class Frodo extends Hobit {
   public static void main(String[] args) {
      int myGold = 7;
//      System.out.println(countGold(7, 6)); => (xNC) because need instance of the class to call method on.
      Hobit hobit = new Hobit();
      Frodo frodo = new Frodo();

      System.out.println(hobit.countGold(myGold, 6));
      System.out.println(frodo.countGold(myGold, 6));
   }
}

class Hobit {
   int countGold(int x, int y) {return x + y;}
}