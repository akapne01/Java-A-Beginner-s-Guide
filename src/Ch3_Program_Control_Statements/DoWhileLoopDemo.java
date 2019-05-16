/*
  p. 85
  Demonstrates do-while Loop
  ??? Why prints System.out.println("Press a key followed by ENTER: ");
  twice?
*/

class DoWhileLoopDemo {
  public static void main(String[] args) throws java.io.IOException {

    char ch;

    do {
      System.out.println("Press a key followed by ENTER: ");
      ch = (char) System.in.read(); // get a char
    } while (ch != 'q');

  } // main
} // class
