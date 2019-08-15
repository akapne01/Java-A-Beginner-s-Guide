package WhizLabsTests.practice_1;

public class P1_49 {

   public static void main(String[] args) {

      System.out.print(A.s);
      System.out.print(A.value);
   }
}

interface A {
   static int value = 15;
   String s  = "Value is: ";
}