package Ch10_Using_Input_and_Output;

/*
 * p. 365
 * Demonstrate PrintWriter to write on the console
 */

import java.io.PrintWriter;

public class PrintWriterDemo {
   public static void main(String[] args) {
      PrintWriter printWriter = new PrintWriter(System.out, true);
      int i = 10;
      double d = 123.65;

      printWriter.println("Using a PrintWriter");
      printWriter.println(i);
      printWriter.println(d);

      printWriter.println(i + " + " + d + " is " + (i + d));
   }
}
