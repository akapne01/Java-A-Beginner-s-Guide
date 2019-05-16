/*
  p46 BG
  Demonstrate the Block Scope
*/

class ScopeDemo {
  public static void main(String[] args) {
    int x; // known to all code within public static void main(String[] args) {

    x = 10;
    if (x == 10) { // starts a new scope

      int y = 20; // known only to this Block

      // x and y both known here

      System.out.println("x and y: " + x + " " + y);

      x = y * 2; // changes x to be 40
    }

    // y = 100; Error as y is not known here

    // x is still known here
    System.out.println("x is " + x); // prints x = 40

  }
}
