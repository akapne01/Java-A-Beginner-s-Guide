package WhizLabsTests.api;

import java.util.ArrayList;
import java.util.List;

public class W9_5 {

   public static void main(String[] args) {

      List<String> strings = new ArrayList<>();
      strings.add("A");
      strings.add("B");
      strings.add("C");

      String arr[] = new String[2];

      arr = strings.toArray(arr);

      for (String s : arr) {
         System.out.print(s);
      }
   }
}
