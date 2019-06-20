package Ch10_Using_Input_and_Output;

/*
 * p. 370
 *
 * Averages a list of number entered by the user.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageNumbersUsingWrappers {
   public static void main(String[] args) throws IOException {
      // Create a buffered Reader using System.in
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      String str;
      int n;
      double sum = 0.0;
      double avg, t;

      System.out.println("How many numbers will you enter? ");
      str = bufferedReader.readLine();
      try {
         n = Integer.parseInt(str);
      } catch (NumberFormatException e) {
         System.out.println("Invalid Format");
         n = 0;
      }

      System.out.println("Enter " + n + " values.");
      for (int i = 0; i < n; i++) {
         System.out.print(": ");
         str = bufferedReader.readLine();
         try {
            t = Double.parseDouble(str);
         } catch (NumberFormatException e) {
            System.out.println("Invalid format");
            t = 0.0;
         }

         sum += t;
      }
      avg = sum / n;
      System.out.println("Average is " + avg);
   }
}
