package Ch10_Using_Input_and_Output;

/*
 * p. 351
 * This version of the ShowFile program uses a try-with-resources to automatically
 * close file when it is no longer needed
 */

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFileAutoClose {
   public static void main(String[] args) {
      int i;

      // First make sure that a file name has been specified
      if (args.length != 1) {
         System.out.println("Usage: ShowFile filename");
         return;
      }

      /*
       * The following code uses try-with-resources to open a file
       * and then automatically close it when the try block is
       * left.
       *
       * After try in the () specify and create an input stream that will be
       * read and when it is defined in this way, it will automatically be
       * closed. In this way fin is declared and created inside the () right
       * after try. It is local to the try block. When the block is excited,
       * fin is automatically closed by implicit close() call.
       *
       * Resource declared in try statement is implicitly *final*.
       * Can't be reassigned and scope limited to try block.
       */

      try (FileInputStream fin = new FileInputStream(args[0])) {
         do {
            i = fin.read();
            if (i != -1) System.out.print((char) i);
         } while (i != -1);
      } catch (IOException e) {
         System.out.println("I/O Error: " + e);
      }
   }
}
