/*
  p. 85 - BG
  4th version of Guess the Letter game
*/

class Guess4 {
  public static void main(String[] args) throws java.io.IOException {

    char ch, ignore, answer = 'K';

    do {
      System.out.println("I'm thining of a letter between A and Z");
      System.out.print("Can you guess it: ");

      //  read a character
      ch = (char) System.in.read();

      // discard any characters in the input buffer
        // reads all chars until reaches end of line
        // keeps only first one and disregards all other ones
      do {
        ignore = (char) System.in.read();
      } while (ignore != '\n');

      // checks if enetered char is answer
      if (ch == answer) System.out.println("** Right **");

      else {
          System.out.println("... Sorry, you're ");
          if (ch < answer) System.out.println("too low.");
          else System.out.println("too high.");
          System.out.println("Try again! \n");
      } // else

    } while (answer != ch); // do

  } // main
} // class
