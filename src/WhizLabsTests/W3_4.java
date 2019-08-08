package WhizLabsTests;

/**
 * Throws null pointer exception.
 */
public class W3_4 {
   public static void main(String[] args) {

      int array[][] = new int[2][];
      /**
       * Above is equivalent to array = {{null}, {null}};
       * and when trying to obtain [0] element, it throws
       * NullPointerException, because it defaults to null
       * the columns of the array that are not declared.
       */
      array[0][0] = 0;
      System.out.println(array[0][0]);
   }
}
