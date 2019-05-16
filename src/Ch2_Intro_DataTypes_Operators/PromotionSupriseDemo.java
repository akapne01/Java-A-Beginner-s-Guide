/*
  p.61 - BG
  A promotion Suprise!
*/

class PromotionSupriseDemo {
  public static void main(String[] args) {

    byte b;
    int i;

    b = 10;
    i = b * b; // OK, no cast needed. Operations between 2 bytes are int

    b = 10;
    b = (byte) (b * b); // cast needed!

    System.out.println("i and b: " + i + " " + b);
  }
}
