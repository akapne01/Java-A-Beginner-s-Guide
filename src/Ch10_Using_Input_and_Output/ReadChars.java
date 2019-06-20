package Ch10_Using_Input_and_Output;

/*
 * p. 363
 * Use a BufferedReader to read characters from the console
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
   public static void main(String[] args) throws IOException {
      char c;
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter characters. Press . to quit");

      // read characters
      do {
         c = (char) bufferedReader.read();
         System.out.println(c);
      } while (c != '.');
   }
}
