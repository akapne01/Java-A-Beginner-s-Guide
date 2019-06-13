package Ch10_Using_Input_and_Output;

/*
 * p. 350
 * Copy a text file.
 * To use this program, specify the name of the source
 * file and the destination file.
 * For example, to copy a file called FIRST.TXT
 * to a file called SECOND.TXT use the following
 * command line.
 *
 * java CopyFile FIRST.TXT SECOND.TXT
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
   public static void main(String[] args) throws IOException {

      int i;
      FileInputStream fin = null;
      FileOutputStream fout = null;

      // First, make sure that both files have been specified.
      if (args.length != 2) {
         System.out.println("Usage CopyFile from to");
         return;
      }

      // Copy a file
      try {
         // Attempt to open the files
         fin = new FileInputStream(args[0]);
         fout = new FileOutputStream(args[1]);
         /*
          * Reads 1 byte from the input and writes in output file
          * until reaches the end of the file which is denoted by -1
          */
         do {
            i = fin.read();
            if (i != -1) fout.write(i);
         } while (i != -1);
         // Catches the exception that might arise by creating a input and
         // output file objects
      } catch (IOException e) {
         System.out.println("I/O Error: " + e);

         // Doesn't matter if something was successful or not, close the
         // files which were open. There is a separate try and catch pair
         // for input and output files.
      } finally {

         /*
          * Closes the input stream
          */
         try {
            if (fin != null) fin.close();
         } catch (IOException e) {
            System.out.println("Error Closing Input File!");
         }

         /*
          * closes the output stream
          */
         try {
            if (fout != null) fout.close();
         } catch (IOException e) {
            System.out.println("Error Closing Output File!");
         }
      }

   }
}
