package Ch10_Using_Input_and_Output;

/*
 * p. 364
 * Read string from console using BufferedReader
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLines {
   public static void main(String[] args) throws IOException {
      // Create a Buffered Reader using System.in
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));

      String str;

      System.out.println("Enter lines of text.");
      System.out.println("Enter 'stop' to quit");
      do {
         // readLine reads a line of text, null returned when end reached
         str = bufferedReader.readLine();
         System.out.println(str);
      } while (!str.equals("stop"));
   }
}
