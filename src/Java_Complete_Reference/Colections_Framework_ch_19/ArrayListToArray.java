package Java_Complete_Reference.Colections_Framework_ch_19;

// p. 554

import java.util.ArrayList;

public class ArrayListToArray {
   public static void main(String[] args) {

      // Create an array list
      ArrayList<Integer> a1 = new ArrayList<>();

      // Add elements to ArrayList
      a1.add(1);
      a1.add(2);
      a1.add(3);
      a1.add(4);

      int s = 0;

      for (int i : a1) {
         s += i;
      }

      System.out.println("s is " + s);
      System.out.println("Contents of a1: " + a1);

      // Get the array
      Integer ia[] = new Integer[a1.size()];
      System.out.println(ia.getClass().isArray());
      ia = a1.toArray(ia);

      int sum = 0;

      // Sum the array
      for (int i : ia) {
         sum += i;
      }

      System.out.println("Sum is: " + sum);
   }
}
