/*
  p.69 - BG
  Guess the letter game, 3rd version
  Add nested if
*/

class Guess3 {
  public static void main(String[] args) throws java.io.IOException {

    char ch, answer = 'K';

    System.out.println("I'm thinking about letter between A and Z.");
    System.out.print("Can you guess it: ");

    ch = (char) System.in.read();

    if (ch == answer) System.out.println("** Right **");
    else {
      System.out.print("...Sorry, you're ");
      // nested if statement
      if (ch < answer) System.out.println("too low");
      else System.out.println("too high");
    }
  }
}
