package WhizLabsTests.practice_2;

public class P2_70 {
   public static void main(String[] args) {
      String s = "1Z";
      s.concat("0"); // this is not assigned to variable s and Strings are immutable, so this change is lost forever.
      s += "1";
      System.out.println(s + "-808");
   }
}
