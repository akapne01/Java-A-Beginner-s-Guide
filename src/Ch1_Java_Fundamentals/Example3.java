/*
  This program ilustrates difference between int and double
*/

class Example3 {
  public static void main(String[] args) {
      int v; // declare int var
      double x; // declare floating point var

      v = 10;

      x = 10.0;

      System.out.println("Original value of v (int): " + v);
      System.out.println("Original value of x (double): " + x);
      System.out.println(); // outputs blank line

      // now, divide both by 4
      v = v / 4; // fractional component lost
      x = x / 4; // fractional component preserved

      System.out.println("v after divison: " + v);
      System.out.println("x after divison: " + x);
  }
}
