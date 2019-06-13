package Ch10_Using_Input_and_Output;

/*
 * p. 348
 * This variation wraps the code that opens and accesses the
 * file within a single try block.
 * The file is closed by the finally block.
 */

import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile2 {
   public static void main(@NotNull String[] args) {

      int i;
      // fin is initialized to null
      FileInputStream fin = null;

      // Fist confirm that a file name has been specified.
      if (args.length != 1) {
         System.out.println("Usage: ShowFile filename");
         return;
      }

      /*
       * The following code opens a file, reads characters until
       * EOF is encountered, and then closes the file via a finally
       * block.
       */
      try {
         fin = new FileInputStream(args[0]);

         do {
            i = fin.read();
            if (i != -1) {
               System.out.print((char) i);
            }
         } while (i != -1);
         // File not found
      } catch (FileNotFoundException e) {
         System.out.println("File Not Found! " + e);
         // Any other IO Exception
      } catch (IOException e) {
         System.out.println("An I/O exception Occurred.");
         // Closes file if fin differs from the null, and if
         // error closing file, the exception is thrown
      } finally {
         // Close file in all cases.
         try {
            if (fin != null) fin.close();
         } catch (IOException e) {
            System.out.println("Error Closing File.");
         }
      }
   }
}