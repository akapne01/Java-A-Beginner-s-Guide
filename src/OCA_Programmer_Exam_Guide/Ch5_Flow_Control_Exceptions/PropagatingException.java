package OCA_Programmer_Exam_Guide.Ch5_Flow_Control_Exceptions;

public class PropagatingException {
   public static void main(String[] args) {
      try {
         reverse("Saule");
         reverse("");
         reverse("Meness");
      }
      finally {
         System.out.println("Inside finally block.");
      }
   }

   static String reverse(String str) {
      if (str.length() == 0) {
         throw new RuntimeException();
      }

      String reversestr = "";
      for (int i = str.length() - 1; i >= 0; --i) {
         reversestr += str.charAt(i);
      }
      System.out.println(reversestr);
      return reversestr;
   }
}
