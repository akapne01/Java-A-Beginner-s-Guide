package OCA_Programmer_Exam_Guide.Ch3_Assignments;

/**
 * p. 199
 * Local primitives variable initialization.
 */
public class TimeTravel {
   public static void main(String[] args) {

      /**
       * The integer year is defined as an automatic variable,
       * because it is within the curly braces of a method.
       *
       * Local variables, including primitives, always have to
       * be initialized before you can use them.
       */
      int year = 2050; // if value is not given to year, then the code will not compile.
      // Local variables always must be initialized.
      System.out.println("the year is " + year);
   }
}

class TimeTravel2 {
   public static void main(String[] args) {
      int year; // Declared, not init
      int day; // Declared, not init
      System.out.println("You step into the portal.");
      year = 2050; // Assign explicit value
      System.out.println("Welcome to the year " + year);

      /**
       * This code compiles, because even though day has not
       * been initialized, as long as we are not attempting to
       * use this variable, the code will compile.
       */
   }
}
