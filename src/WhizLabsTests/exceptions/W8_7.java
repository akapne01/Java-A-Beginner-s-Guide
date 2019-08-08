package WhizLabsTests.exceptions;

public class W8_7 {
   public static void main(String[] args) {
      try {
         print("1.0");
      } catch (Exception e) {
         System.out.print("C");
      }
   }

   public static void print(String s) {
      try {
         System.out.println(Integer.parseInt(s));
      } catch (NumberFormatException e) {
         System.out.print("A");
         throw new RuntimeException();
      } finally {
         System.out.print("B");
      }
   }
}
