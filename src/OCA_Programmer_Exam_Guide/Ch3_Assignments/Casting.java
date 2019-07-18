package OCA_Programmer_Exam_Guide.Ch3_Assignments;

//p. 184

public class Casting {

   public static void main(String[] args) {
      byte b1 = 3;
      byte b2 = 8;
//   byte b3 = b1 + b2; Java automatically promotes result to int
      byte b3 = (byte) (b1 + b2); // compiles with explicit cast

      int a, b, c;
      int j, k = 1, l, m = 3;
//      int x, y=x+1, z; x is not initialized so => (xNC). If it's an instance var, then ok to use it as well,
      // they get assigned default values.

      double d = 100L; // Implicit cast. long => double
//      long l = 3957.229; // => (xNC) Double => Long is explicit cast. Possible loss of precision.

      int x = (int) 3957.229;
      System.out.println("int x = " + x);

      long l1 = 56L;
      byte b4 = (byte) l1;
      System.out.println("The byte is " + b4);

      long l2 = 130L;
      byte b5 = (byte) l2;
      System.out.println("The byte is " + b5);

      float f = 234.56F;
      short s = (short) f;
      System.out.println(s);

      // Floating points
//      float f2 = 32.3;  => (xNC) floating point values are implicitly double. There is not enough
//      space to hold double value in the float, therefore, f needs to be added at the end or
//      explicitly cast it.
      float f3 = (float) 32.3;
      float g = 32.2f;
      float h = 32.3F;

      /**
       * Assigning literal that is too large for a variable.
       */
//      byte a5 = 128; => (xNC) 128 is already an int, and we are trying to assign int to byte,
//      when it doesn't fit there. Compiler cannot automatically convert the value.
      byte a6 = (byte) 128; // can force the conversion using cast. Result is -128. Byte overflows
      // and that is the next value in the byte range.
      System.out.println(a6);

      /**
       * Compound operators += -=, etc. all implicitly cast.
       * b + 7 results to an int, but the compound operator
       * assigns that value to byte, and it is implicitly
       * and automatically casted from int to byte.
       */
      byte b7 = 3;
      b7 += 7; // this compiles
      b7 = (byte) (b7 + 7); // this need to be specifically casted, otherwise xNC. This is equivalent to above expression.
      System.out.println(b7);
   }
}
