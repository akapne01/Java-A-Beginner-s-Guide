package Other;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Trying_set {
   public static void main(String[] args) {
      String strarr[] = {"A", "B", "C", "D"};

      Set<String> set = new HashSet<String>(Arrays.asList(strarr));

      System.out.println(set);

      for (String item : set) {
         System.out.println(item);
      }
   }

}
