package OCA_Programmer_Exam_Guide.Ch3_Assignments;

// p. 178

/**
 * Literals is a source code representation of the primitive data types
 */

public class Literals {

   /**
    * Underscores for readability
    * All numeric data types can inclde _ in the literals for readability.
    * Can't be:
    * 1) Beginning or end
    * 2) Float, double => before or after decimal point
    * 3) Hex numbers => next to X if 0_X_ => (xNC)
    * 4) Binary => next to B
    */
   int pre7 = 1000000;
   int with7 = 1_000_000;
   //   int i1 = _1_000_000; => (xNC)
   int i2 = 10_0000_0; // => Legal, but confusing
   //   int i3 = 0_b01; => (xNC)
   //   int i4 = 0b_01; => (xNC)

   /**
    * Integers
    * Has 4 ways:
    * 1) Decimal
    * 2) Binary
    * 3) Octal
    * 4) Hexadecimal
    * <p>
    * All 4 types are defined as int by default, but also can be
    * long, if suffix L or l is put after the literal.
    */

   /* Decimal */
   int length = 343;
   long jo = 110599L;
   //   int 25,343; => (xNC) Not compile with comma.

   /* Binary */
   int b1 = 0B101010;
   int b2 = 0b00011;

   /* Octal - (0 + 21 digits max) */
   int six = 06;
   int seven = 07;
   int eight = 010;
   int nine = 011;

   /* Hexadecomal */
   int x = 0X0001;
   int y = 0x7ffff_fff;
   int z = 0xDeadCafe;
   long so = 0xFFFFl;

   /**
    * Floating point literals
    * Default = double (64 bits)
    * Float (32 bits). Requires suffix f or F
    */
   double d = 11301874.9881024;
   //   float f = 23.467890; => (xNC) Loss of precision. By default is double
   float f = 23.467890f;
   float g = 49837849.029847F; // => Ok, has the suffix F

   /**
    * Boolean literals
    */
   boolean t = true;
//   boolean ff = 0; => (xNC) Can't use numbers, only true or false.

   /* Exam lookout */
   int p = 1;
//   if (p) {} => (xNC) P is int and not boolean. Only booleans can be used in if.

   /**
    * Char literals -  single char in single quotes
    * 16 bit unsigned integers under the hood.
    * 0 - 65535.
    */
   /* Legal */
   char a = 'a';
   char b = '@';
   char aa = 0x892;
   char bb = 982;
   char cc = (char) 70000;
   char dd = (char) -98;

   /* Not legal */
//   char e = -29; => (xNC) poss loss of precision, needs cast.
//   char ff = 70000; => (xNC) poss loss of precision, needs cast.

   /* Other char literals */
   /**
    * Can use the escape code (backslash char \) to represent a character that
    * can't be types in as a literal, including chars for linefeed, newline,
    * horizontal tab, backspace, quotes.
    */
   char doubleQuote = '\"';
   char newline = '\n';
   char tab = '\t';


   /* Unicode can be used as char with '\ u' */
   char letterN = '\u004E'; // letter 'N'

   /**
    * Strings and arrays are non primitive types that have a literal representation.
    */
   String s = "Bill Joy";
//   System.out.println("Bill" + " Joy"); also this one.

   public static void main(String[] args) {
      Literals l = new Literals();
      System.out.println(l.jo);
      System.out.println(l.so);
      System.out.println(l.letterN);
      System.out.println(l.dd);
   }
}
