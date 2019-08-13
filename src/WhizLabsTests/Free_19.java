package WhizLabsTests;

public class Free_19 {
   public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("1Z0");
      /**
       * Below line does not compile, because
       * StringBuilder doesn't have method concat.
       */
//      sb.concat("-808");
      System.out.println(sb);
   }
}
