/*
  p.57 - BG
  Demonstrates casting
*/

class CastDemo {
  public static void main(String[] args) {

      double x, y;
      byte b;
      int i;
      char ch;

      x = 10.0;
      y = 3.0;

      i = (int) (x / y); // cast double to int
      b = (byte) i; // No loss here, a byte can hold up to value 100
      System.out.println("Value of b from i (10.0 / 3.0): " + b);

      i = 257;
      b = (byte) i; // Info loss at this time
      System.out.println("Value of b casted from 257: " + b); // prints 1

      b = 88; // ASCII code for X
      ch = (char) b; // Cast between incompatible types
      System.out.println("ch casted from byte 88 is: " + ch);

  }
}
