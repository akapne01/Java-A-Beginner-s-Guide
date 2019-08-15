package WhizLabsTests.diagnostics1;

public class WD_14 {
   public WD_14() {
      System.out.println("contructor");
   }

   public static void main(String[] args) {
      System.out.println("Main");
      WD_14 wd_14 = new WD_14();
      WD_14 wd_142 = new WD_14();
   }

   /** Called each time when instance created, before constructor finishes. */
   {
      System.out.println("Whiz, instance block");
   }

   static {
      System.out.println("static");
   }
}
