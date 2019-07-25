package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

/** SWITCH statement
 * p. 278
 * <p>
 * Compile time constants:
 * 1) final
 * 2) value assigned at declaration
 * 3) Primitives and Strings (in context of switch excludes float, double and long)
 * 4) Can be implicitly casted
 * 5) Explicit cast
 * 6) Multiplicative operators : * / %
 * 7) Additive operators: + -
 * 8) Shift operators >> << >>>;
 * 9) Relational operators:  <, <=, >, and >= (but NOT instanceof)
 * 10) Equality Operators == !=
 * 11) Bitwise and logical operators  &, ^, and |
 * 12) Conditional operators: and and or && ||
 * 13) Ternary operator ?
 * 14) Parenthesized expression (containing const)
 * 15) Simple names, refer to const variables
 * 16) Qualified names of the form  TypeName.
 * 17) Identifier that refer to const variables
 * Const String variables are always interned so as to share unique instances,
 * using method String.intern
 * <p>
 * Examples:
 * true
 * (short)(1*2*3*4*5*6)
 * Integer.MAX_VALUE / 2
 * 2.0 * Math.PI
 * "The integer " + Long.MAX_VALUE + " is mighty big."
 * From: https://docs.oracle.com/javase/specs/jls/se8/jls8.pdf p. 612 - 613
 * <p>
 * <p>
 * SWITCH can only check for equality so other operators are unusable in switch, in this case.
 */
public class CompileTimeConstant {
   public static void main(String[] args) {
      final int a = 1;
      final int b;
      int c = 3;
      final int d = 4;
      final int e = 5;
      b = 2;
      int x = 0;
      switch (x) {
         case a:
//         case b: => (xNC) because b is assigned value later, so it is not init as a constant
//         case c: => (XNC) not final, so it is not a constant, but variable
//         case (c /a ): => (xNC) c is not a constant
         case (d / a): // compiles, result is a constant
         case d / e: // compiles with and without brackets.
      }

      String s = "xyz";
      switch (s.length()) {
         case 1:
            System.out.println("Length is 1");
            break;
         case 2:
            System.out.println("Length is 2");
            break;
         case 3:
            System.out.println("Length is 3");
            break;
         default:
            System.out.println("No match");
      }

      /**
       * Here byte is implicitly cast to the int so it is ok to be used in the switch
       * statement. But, 128 is too large for the byte and that is why it does not
       * compile.
       */
      byte g = 2;
      switch(g) {
         case 23:
//         case 128:
      }

      /**
       * Illegal to have more that 1 case label with the same value
       */
      int temp = 90;
      switch (temp) {
         case 80:
            System.out.println("80");
//         case 80:
//            System.out.println("80"); // => (xNC) can't have 2 labels with the same value
      }

      /**
       * It is legal to leverage the power of Boxing in a switch expression
       */
      switch (new Integer(4)) {
         case 4:
            System.out.println("Boxing is OK");
      }
   }
}
