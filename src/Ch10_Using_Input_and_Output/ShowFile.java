package Ch10_Using_Input_and_Output;

/*
 * p. 346
 * Display a text file
 *
 * To use this program, specify the nae of the file that you
 * want to see.
 * For example, to see a file called TEST.TXT,
 * use the following command line.
 *
 * java ShowFile TEST.TXT
 *
 * For intelliJ to read files, they have to be in the folder that
 * is marked as a working directory. And command line arguments
 * need to be added on the Run/EditConfigurations
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
   public static void main(String[] args) {
      int i;
      // file input stream declaration
      FileInputStream fin;

      // First, make sure that a file has been specified.
      if (args.length != 1) {
         System.out.println("Usage: ShowFile FileName");
         return;
      }

      /*
       * Creates a new File input stream instance with the
       * argument as a given file name. This creates an
       * object from the file we want to read. If file
       * doesn't exist, it is not possible to create this
       * instance so the File not found exception is thrown
       * and we catch it by printing out that File is not found.
       */
      try {
         fin = new FileInputStream(args[0]);
      } catch (FileNotFoundException e) {
         System.out.println("File Not Found!");
         return;
      }

      /*
       * With this try and catch pair we are are reading the
       * file content.
       * .read() method reads a single byte from the file and
       * returns it as an integer. When end of the line is
       * encountered, it returns -1. We are reading file, and
       * if the integer that is returned back is not -1, then
       * printing it out. If -1 returned then we stop the loop.
       * If error reading the file, then exception is caught
       * and Error reading the file is printed out.
       */
      try {
         // read bytes until EOF is encountered
         do {
            i = fin.read();
            if (i != -1) System.out.print((char) i);
         } while (i != -1);
      } catch (IOException e) {
         System.out.println("Error reading the file.");
      } finally {
         /*
          * Finally block ensures that no matter how the try block
          * of reading the file terminates, the file gets closed.
          *
          * Another advantage, no matter if it terminates due to the
          * IO exception or any other exception, it is still closed
          * regardless.
          *
          * This try/catch pair is closing the file to free up the
          * resources. If there is any error in closing the file,
          * then exception is thrown and we are catching IOException
          * by warning the user that there was an error closing the file.
          */
         try {
            fin.close();
         } catch (IOException e) {
            System.out.println("Error closing the file.");
         }
      }
   }

}
