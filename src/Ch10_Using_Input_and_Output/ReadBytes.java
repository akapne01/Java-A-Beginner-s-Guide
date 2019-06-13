package Ch10_Using_Input_and_Output;

/*
 * p. 344
 * Read an array of bytes from the keyboard
 */

import java.io.IOException;

public class ReadBytes {
   public static void main(String[] args) throws IOException {
      byte data[] = new byte[10];

      System.out.println("Enter some characters.");
      // Uses read method on System.in instance. Returns the integer
      // representation of the next available char.
      System.in.read(data);
      System.out.print("You entered: ");

      // Read the data array, it consists of integer values that are then
      // casted to the characters
      for (int i = 0; i < data.length; i++) {
         System.out.print((char) data[i]);
      }

   }
}
