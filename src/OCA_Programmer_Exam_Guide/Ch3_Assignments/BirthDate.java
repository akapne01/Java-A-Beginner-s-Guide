package OCA_Programmer_Exam_Guide.Ch3_Assignments;

// p. 196

public class BirthDate {
   int year;

   public static void main(String[] args) {
      BirthDate bd = new BirthDate();
      bd.showYear();
   }

   public void showYear() {
      /**
       * Year is automatically initialized to 0
       */
      System.out.println("This year is " + year);
   }
}
