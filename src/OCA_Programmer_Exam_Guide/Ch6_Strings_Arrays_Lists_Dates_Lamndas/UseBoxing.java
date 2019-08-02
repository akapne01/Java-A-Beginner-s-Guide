package OCA_Programmer_Exam_Guide.Ch6_Strings_Arrays_Lists_Dates_Lamndas;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * p. 387
 * OCA
 */
public class UseBoxing {
   public static void main(String[] args) {

      UseBoxing u = new UseBoxing();
      u.go(5);
   }

   boolean go(Integer i) { // boxes the int it was passed
      Boolean ifSo = true; // boxes the literal
      Short s = 300; // boxes the primitive
      if (ifSo) { // Unboxing
         System.out.println(++s); // unboxes, increments, reboxes
      }

      return !ifSo; // unboxes, returns the inverse
   }
}
