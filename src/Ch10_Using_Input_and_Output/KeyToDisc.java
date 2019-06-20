package Ch10_Using_Input_and_Output;

/*
 * p. 366
 * A simple key-to-disc utility that demonstrates a FileWriter.
 */

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyToDisc {
   public static void main(String[] args) throws IOException {
      String str;
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter text ('stop' or 'quit').");

      try (FileWriter fileWriter = new FileWriter("test.txt")) {
         do {
            System.out.println(": ");
            str = bufferedReader.readLine();

            if (str.compareTo("stop") == 0) {
               break;
            }

            str = str + "\r\n"; // Add new line
            fileWriter.write(str);
         } while (str.compareTo("stop") != 0);
      } catch (IOException e) {
         System.out.println("I/O Error: " + e);
      }
   }
}
