package WhizLabsTests.diagnostics1;

public class WD_68 {

   public static void main(String[] args) {

      char[] chars = {'1', 'Z', '0', '-', '8', '1'};

      System.out.println("abcd".indexOf("c"));


      StringBuilder sb = new StringBuilder();
      // adds: 1Z0-8
      sb.append(chars,0, chars.length-1);

      sb.append("08"); // sb = 1Z0-808

      /**
       * Truncates string builder to be 4 chars long.
       */
      sb.setLength(4); // Abstract StringBuilder method

      /**
       * Produces StringIndexOutOfBounds Exception.
       * Trying to add string outside the string builder
       * current capacity.
       */
      sb.insert(5, "10");
      System.out.println(sb);

   }
}
