package OCA_Programmer_Exam_Guide.Ch3_Assignments;

// p. 197

public class Book2 {
   private String title;

   public String getTitle() {
      return title;
   }

   public static void main(String[] args) {
      Book2 b = new Book2();
      /**
       * Title is initialized to null when b is created.
       * Title is instance reference variable.
       * Null means that the instance variable is not referring
       * to any object on the heap.
       */
      System.out.println("The title is " + b.getTitle());

      /**
       * Below code compiles, but because s is null and we are
       * trying to call a method on the variable that is not
       * pointing to any object, we are getting a NullPointerException
       * at Runtime.
       */
      String s = b.getTitle();
//      String t = s.toLowerCase();

      /**
       * To check if object has bee initialized
       */
      if (s != null) {
         String t = s.toLowerCase();
      }
   }
}
