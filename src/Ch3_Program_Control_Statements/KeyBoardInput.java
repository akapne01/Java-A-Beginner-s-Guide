/*
  Read a character from the keyboard
*/

class KeyBoardInput {
  public static void main(String[] args) throws java.io.IOException {

      System.out.println("Press a key followed by ENTER: ");

      // Reads a characher from the keyboard
      /*
        System.in.read reads only 1 character in integer format
        Reads the UNICODE value of the char from keyboard.
        Needs to be casted to char if want to use it as a char.
        .read() requires to throw exception 
      */
      char ch = (char) System.in.read();

      System.out.println("Your key is " + ch);
    }
  }
