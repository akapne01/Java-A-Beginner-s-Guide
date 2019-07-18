package Java_Complete_Reference.Colections_Framework_ch_19;
// p. 557

import java.util.HashSet;

public class HashSetDemo {

   public static void main(String[] args) {

      // Create a HashSet
      HashSet<String> hs = new HashSet<>();

      // Add elements to the HashSet
      hs.add("Beta");
      hs.add("Alpha");
      hs.add("Eta");
      hs.add("Gamma");
      hs.add("Epsilon");
      hs.add("Omega");

      System.out.println(hs);
   }
}
