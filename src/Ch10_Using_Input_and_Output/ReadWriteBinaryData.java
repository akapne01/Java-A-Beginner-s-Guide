package Ch10_Using_Input_and_Output;

/*
 * p. 355
 * Write and read back Binary data.
 * Primitive data types use Data Input and Output streams.
 * They implement DataInput and DataOutput interfaces respectively.
 * Data Input stream uses InputStream instance as foundation.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBinaryData {
   public static void main(String[] args) {
      int i = 10;
      double d = 1023.56;
      boolean b = true;

      // Writes below values in the file called testdata in src folder.
      /*
       * Content of the files is written in binary, if open by text editor,
       * it is not understandable. But can be read back with Java and converted
       * to human readable format.
       */
      try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
         System.out.println("Writing " + i);
         dataOut.writeInt(i);

         System.out.println("Writing " + d);
         dataOut.writeDouble(d);

         System.out.println("Writing " + b);
         dataOut.writeBoolean(b);

         System.out.println("Writing " +  12.2 * 7.4);
         dataOut.writeDouble(12.2 * 7.4);

      } catch (IOException e) {
         System.out.println("Write error.");
         return;
      }

      System.out.println();

      /*
       * Reads file testdata back and prints to the console
       */

      try (DataInputStream dataIn = new DataInputStream( new FileInputStream("testdata"))) {
         i = dataIn.readInt();
         System.out.println("Reading " + i);

         d = dataIn.readDouble();
         System.out.println("Reading " + d);

         b = dataIn.readBoolean();
         System.out.println("Reading " + b);

         d = dataIn.readDouble();
         System.out.println("Reading " + d);
      } catch (IOException e) {
         System.out.println("Read error.");
      }
   }
}
