package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

/**
 * p. 280
 * Break and fall-through switch blocks.
 * <p>
 * Once the case is matched, it will execute all the other case
 * statements after if no break is there.
 * <p>
 * Below prints: green blue done
 */
public class SwitchString {
   public static void main(String[] args) {
      String s = "green";
      switch (s) {
         case "red":
            System.out.println("red");
         case "green":
            System.out.println("green");
         case "blue":
            System.out.println("blue");
         default:
            System.out.println("done");
      }

      /**
       * Default can be in the middle as well. It is treated in
       * exactly the same way when it comes to the fall-through
       * as other case statements.
       * Output: default 3
       */
      int x = 7;
      switch (x) {
         case 2:
            System.out.println("2");
         default:
            System.out.println("default");
         case 3:
            System.out.println("3");
      }
   }
}
