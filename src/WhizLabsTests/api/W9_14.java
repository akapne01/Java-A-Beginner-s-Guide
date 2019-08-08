package WhizLabsTests.api;

public class W9_14 {
   public static void main(String[] args) {
      String a = new String(); // empty
      String b = new String(new byte[] {88,89}); // XY
      String c = new String(new char[] {'1', '2', '3'}); // 123
      String d = new String(new StringBuilder("ABCD")); // ABCD

      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);

   }
}
