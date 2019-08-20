package WhizLabsTests.practice_3;

public class P3_47 {

   int i = 10;

   public static void main(String[] args) {
      /**
       * Doesn't compile, because i is initialized through
       * if statement and it is not guaranteed tht it will be executed.
       */
      int i;
      if(new P3_47().go(10)) i = 5;
      if(true) i = 9; // If true then compiles as it is executed 100% of the time.
      System.out.println(i);
   }

   boolean go(int y) {
      if (y>5) return true;
      else return false;
   }
}
