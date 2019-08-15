package WhizLabsTests.practice_1;

public class P1_54 {

   public static void main(String[] args) {

      Double d1 = 10.0/0.0;
      System.out.println("d1 = " + d1);
      Float f1 = 10.0f/0.0f;
      System.out.println("f1 = " + f1);

      Double d2 = 0.0/0.0;
      System.out.println("d2 = " + d2);
      Float f2 = 0.0f/0.0f;
      System.out.println("f2 = " + f2);


      // Integer Class throws arithmetic exception.
//      Integer i1 = 10/0;
//      System.out.println("i1 = " + i1);

      /**
       * If only Byte value used then compiles for Byte wrapper
       * class. As soon as any arithmetic operations are involved.
       * Byte type is also promoted to int.
       */
//
//      Byte b1 = (byte)(1/0);
////      Byte b3 = (Byte)(1/0); Can't cast integer to Byte
//      // Throws arithmetic exception
//      System.out.println("b1 = " + b1);
      byte b2 = 1;
//
//      Integer i3 = 0/0;
//      System.out.println("i3 = " + i3);



   }
}
