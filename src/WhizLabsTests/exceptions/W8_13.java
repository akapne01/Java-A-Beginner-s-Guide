package WhizLabsTests.exceptions;

public class W8_13 {

   public static void main(String[] args) {
      try {
         System.out.println("A");
         throw new RuntimeException();
      } catch (Exception e) {
         System.out.println("E");
//      } catch (RuntimeException e) {
//         System.out.println("R");
      } finally {
         System.out.println("F");
      }
   }
}
