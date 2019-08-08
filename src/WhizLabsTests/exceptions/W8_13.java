package WhizLabsTests.exceptions;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class W8_13 {

   public static void main(String[] args) {

      List<String> strings = new ArrayList<>();
      strings.add("ARR1");
      strings.add("ARR2");
      strings.add("ARR3");
      String[] aa = new String[2];
      aa = strings.toArray(aa);
      for (String a : aa) {
         System.out.println(a);
      }


      try {
         System.out.println("A");
         throw new RuntimeException();
      } catch (Exception e) {
         System.out.println("E");
//      } catch (RuntimeException e) {
//         System.out.println("R");
      } finally {
         System.out.println("F");
      }
   }

   void a() {
      return ;
   }
}
