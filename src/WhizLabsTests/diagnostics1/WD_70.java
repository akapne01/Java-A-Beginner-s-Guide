package WhizLabsTests.diagnostics1;

public class WD_70 {

   public static void main(String[] args) {
      Comparable s1 = "Abc";
      Comparable s2 = new String("Abc");
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s1.equals(s2));
   }
}
