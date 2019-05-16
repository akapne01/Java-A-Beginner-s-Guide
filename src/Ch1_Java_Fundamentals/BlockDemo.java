/*
  p26 BG 
  Demonstrate a block of code
*/

class BlockDemo {
  public static void main(String args[]) {
    double i, j, d;

    i = 5;
    j = 10;

    // the target of this is a Block
    if (i != 0) {
      System.out.println("i doesn't equal zero");
      d = j / i;
      System.out.println("j / i is " + d);
    }
  }
}
