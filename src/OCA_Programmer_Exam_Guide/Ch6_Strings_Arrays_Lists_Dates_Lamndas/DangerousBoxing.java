package OCA_Programmer_Exam_Guide.Ch6_Strings_Arrays_Lists_Dates_Lamndas;

/**
 * p. 388
 * OCA
 */
public class DangerousBoxing {

   static Integer x;

   /** Code compiles fine, but throws NullPointerException when
    * doStuff(x) is invoked. x hasn't been initialized and there
    * is no value to unbox!
    */
   public static void main(String[] args) {
      doStuff(x);
   }

   static void doStuff(int z) {
      int z2 = 5;
      System.out.println(z);
   }
}
