/*
  Use the * Pytagoran theorem * to find the length of the
  hypotenuse given the length of two opposing sides.
*/

class Hypot {
  public static void main(String args[]) {
    double x, y, z;

    x = 3;
    y = 4;

    // sqrt is a member of the Math class
    z = Math.sqrt(x * x + y * y);

    System.out.println("Hypotenuse is " + z);
  }
}
