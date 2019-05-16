/*
  p.79 - BG
  Loop until S is typed
  This program demonstrates that loop condition does not have to be
  controlled by loop control variable, but it can be anything.

  Loop demonstrated by this program will run until S is entered
  from the keyboard
*/

class ForLoopControlKeyboard {
  public static void main(String[] args) throws java.io.IOException {

    int i;

    System.out.println("Press S to stop.");

    // This program prints Pass #i and Pass #i+1; WHY? 
    for(i = 0; (char) System.in.read() != 'S'; i++)
      System.out.println("Pass #" + i);
  }
}
