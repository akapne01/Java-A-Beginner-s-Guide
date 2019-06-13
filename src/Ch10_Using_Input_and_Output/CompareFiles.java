package Ch10_Using_Input_and_Output;

/*
 * p. 357
 * Try this 10-1
 * Compare 2 files
 *
 * To use this program, specify the names
 * of the files to be compared as a command
 * line arguments.
 *
 * java CompareFiles first.txt second.txt
 *
 */

import java.io.FileInputStream;
import java.io.IOException;

public class CompareFiles {
   public static void main(String[] args) {
      int i = 0, j = 0;

      // First, make sure that both files specified.
      if (args.length != 2) {
         System.out.println("Usage: CompareFiles file1 file2");
         return;
      }

      // Compare the files
      try (FileInputStream f1 = new FileInputStream(args[0]);
           FileInputStream f2 = new FileInputStream(args[1])) {
         // Now check the contents of each file

         do {
            i = f1.read();
            j = f2.read();
            if (i != j) break;
         } while (i != -1 && j != -1);

         if (i != j)
            System.out.println("Files differ");
         else
            System.out.println("Files are the same.");
      } catch (IOException e) {
         System.out.println("I/O Error: " + e);
      }
   }
}
