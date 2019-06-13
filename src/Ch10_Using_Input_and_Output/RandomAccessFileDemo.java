package Ch10_Using_Input_and_Output;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * p. 359
 * Demonstrates random access files
 *
 * 8 = used, because every double value is 8 bytes long,
 * each new value starts at 8-byte boundary.
 *
 *
 */
public class RandomAccessFileDemo {
   public static void main(String[] args) {
      double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
      double d;

      // Open and use a random access file.
      try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
         // Write values to the file
         for (int i = 0; i < data.length; i++) {
            raf.writeDouble(data[i]);
         }

         // Read back specific values
         raf.seek(0); // seek to first double
         d = raf.readDouble();
         System.out.println("First value is " + d);

         raf.seek(8); // seek to second double
         d = raf.readDouble();
         System.out.println("Second value is " + d);

         raf.seek(8 * 3); // seek to forth double
         d = raf.readDouble();
         System.out.println("Forth value is " + d);

         System.out.println();

         // Now, read every other value
         System.out.println("Here is every other value: ");
         for (int i = 0; i < data.length; i += 2) {
            raf.seek(8 * i); // Seek to i-th double
            d = raf.readDouble();
            System.out.print(d + " ");
         }
      } catch (IOException e) {
         System.out.println("I/O Error: " + e);
      }
   }
}
