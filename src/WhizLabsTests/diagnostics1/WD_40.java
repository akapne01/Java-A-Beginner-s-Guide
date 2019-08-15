package WhizLabsTests.diagnostics1;

public class WD_40 {

   public static void main(String[] args) {

      /**
       * s1 and s2 => true true
       * s1 and s3 => true false. Pointing to 2 different objects.
       * When string created without new keyword, compiler searches for the string literal
       * in the String pool, if found equal, then the reference will refer to it without
       * creating a new one.
       *
       * When using new, to create String, a new String object will be created even if an
       * equal literal is in the pool.
       */
      String s1 = "Rekha";
      String s2 = "Rek" + "ha";
      String s3 = new String("Rekha");

      System.out.println("Comparing s1 and s2");
      System.out.println(s1.equals(s2) + "");
      System.out.println(s1 == s2);

      System.out.println();
      System.out.println("Comparing s1 and s3");
      System.out.println(s1.equals(s3) + "");
      System.out.println(s1 == s3);
   }
}
