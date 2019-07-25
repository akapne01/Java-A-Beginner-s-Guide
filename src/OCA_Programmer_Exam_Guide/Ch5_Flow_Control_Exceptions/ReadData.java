package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * p. 310
 * Exception matching
 */
public class ReadData {
   public static void main(String[] args) {
      try {
         RandomAccessFile raf = new RandomAccessFile("myfile.txt", "r");
         byte b[] = new byte[1000];
         raf.readFully(b, 0, 1000);
      } catch (FileNotFoundException e) {
         System.err.println("File not found!");
         System.err.println(e.getMessage());
         e.printStackTrace();
      } catch (IOException e) {
         System.err.println("IO Error");
         System.err.println(e.toString());
         e.printStackTrace();
      }

      try {
         // do risky IO thing
         System.out.println("Hi");
         throw new IOException("Throwing");
      } catch (IOException e) {
         System.out.println("Caught");
         e.printStackTrace();
         // handle general IOException
//      } catch (FileNotFoundException e) {
//         // handle just FileNotFound Exception.
//      }
      }
   }
}
