package OCA_Programmer_Exam_Guide.Ch6_Strings_Arrays_Lists_Dates_Lamndas;

import java.util.*;

/**
 * p. 380
 * OCA
 * ArrayList
 */
public class Cities {
   public static void main(String[] args) {

      List<String> cities = new ArrayList<>();
      cities.add("Oslo");
      cities.add("Paris");
      cities.add("Rome");
      int index = cities.indexOf("Paris");
      System.out.println(cities + " " + index);
      cities.add("London");
      System.out.println(cities);
   }
}
