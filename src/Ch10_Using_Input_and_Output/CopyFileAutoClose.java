package Ch10_Using_Input_and_Output;

/*
 * p. 353
 * A version of Copy File that uses try-with-resources.
 * It demonstrates two resources (in this case files) being
 * managed by a single try statement.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileAutoClose {
   public static void main(String[] args) {
      int i;

      // Confirm that both files have been specified
      if (args.length != 2) {
         System.out.println("Usage: CopyFileAutoClose from to");
         return;
      }

      /*
       * Open and manage 2 files via the try statement.
       * Both defined in the try statement and separated via semicolon
       */
      try (FileInputStream fin = new FileInputStream(args[0]);
           FileOutputStream fout = new FileOutputStream(args[1])) {
         do {
            i = fin.read();
            if (i != -1) fout.write(i);
         } while (i != -1);
      } catch (IOException e) {
         System.out.println("I/O Error: " + e);
      }
   }
}
