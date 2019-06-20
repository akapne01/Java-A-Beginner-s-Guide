package Ch10_Using_Input_and_Output;

/*
 * p. 371
 * Try this 10-2
 * A help program that uses a disk file helpfile.txt
 * to store help information.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The Help class opens a help file, searches for the
 * topic, and then displays the information associated
 * with that topic.
 * <p>
 * Notice that it handles all I/O exceptions itself,
 * avoiding the need for calling code to do so.
 */
class Help {
   String helpFile; // name of the help file

   // Constructor
   Help(String fileName) {
      helpFile = fileName;
   }

   // Display help on the topic
   boolean helpOn(String what) throws IOException {
      int ch;
      String topic, info;

      // Open the help file
      try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpFile))) {
         do {
            // read characters until a # is found
            ch = helpRdr.read();

            // Now see if the topics match
            if (ch == '#') {
               topic = helpRdr.readLine();
               if (what.compareTo(topic) == 0) { // found topic
                  do {
                     info = helpRdr.readLine();
                     if (info != null) {
                        System.out.println(info);
                     }
                  } while ((info != null) && (info.compareTo("") != 0));
                  return true;
               } // if
            } // if
         } while (ch != -1);
      } catch (IOException e) {
         System.out.println("Error accessing help file.");
         return false;
      } // catch end
      return false;
   }   // helpOn

   // Get a help topic
   String getSelection() throws IOException {
      String topic = "";

      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter topic: ");
      try {
         topic = bufferedReader.readLine();
      } catch (IOException e) {
         System.out.println("Error reading console.");
      }
      return topic;
   }
} // class end

/**
 * Demonstrates the file-based Help system.
 */
public class FileHelp {
   public static void main(String[] args) throws IOException {
      Help help = new Help("helpfile.txt");
      String topic;

      System.out.println("Try the help system. Enter 'exit' to end." );

      do {
         topic = help.getSelection();

         if (!help.helpOn(topic)) {
            System.out.println("Topic not found.\n");
         }
      } while (topic.compareTo("exit") != 0);
   }

}
