package Ch10_Using_Input_and_Output;

/*
 * p. 367
 * A simple disc-to-screen utility that demonstrates a FileReader.
 *
 * FileReader is wrapped in BufferedReader. This gives access to readLine()
 * Also, closing the bufferedReader in case automatically closes the file.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class DiscToScreenUtilty {
   public static void main(String[] args) throws IOException {
      String s;

      // Create and use a FileReader wrapped in a BufferedReader.
      try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"))) {
         while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
         }
      } catch (IOException e) {
         System.out.println("I/O Error: " + e);
      }
   }
}
