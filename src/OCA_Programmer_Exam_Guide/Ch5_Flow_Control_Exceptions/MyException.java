package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * p. 318
 */
public class MyException {
   public static void main(String[] args) {
      for (String a : args) {
         try {
            checkFood(a);
         } catch (BadFoodException e) {
            System.err.println(a + " is a bad food");
            e.printStackTrace();
         }
      }
   }

   static void checkFood(String food) throws BadFoodException {
      List<String> badFoods = new ArrayList<>();
      badFoods.add("Dairy");
      badFoods.add("Meet");
      badFoods.add("Chicken");
      badFoods.add("Fish");

      if (badFoods.contains(food)) {
         throw new BadFoodException();
      }

      System.out.println("Oh, I like the " + food + "!!! Yammy!!!");
   }
}
