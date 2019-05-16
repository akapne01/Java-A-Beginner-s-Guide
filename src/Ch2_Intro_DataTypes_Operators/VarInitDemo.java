/*
  p46 - BG
  Demonstrates lifetime of the variable
*/

class VarInitDemo {
  public static void main(String[] args) {

    int x;

    for (x = 0; x < 3; x++) {
      int y = -1; // y  is initalized each time the block is entered
      System.out.println("y is: " + y); // this always prints -1
      y = 100;
      System.out.println("y is now: " + y);
    }
  }
}
