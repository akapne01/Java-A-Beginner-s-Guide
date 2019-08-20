package ExamCloud.Q3;

public class Test1 {
   public static void main(String[] args) {
      Integer a  =123;
      float b = 123f;
      boolean c = false;

      /**
       * Operator precedence
       */
      if (c | a == b) {
         System.out.println("Inside");
      }
   }
}
