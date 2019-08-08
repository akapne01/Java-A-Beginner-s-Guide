package WhizLabsTests.api;

public class W9_13 {

   public static void main(String[] args) {

      StringBuilder sb = new StringBuilder("Whizlab");
      /** string.length() + 16 = 7+16 = 23 */
      int x = sb.capacity();
      System.out.println(x);

      /** removes unused spaces */
      sb.trimToSize();

      /** New capacity is the length of the string
       * capacity => amount of storage available for newly inserted
       * chars, beyond which an allocation will occur.
       * */
      int y = sb.capacity();
      System.out.println(y);

      /** Previous capacity + updated capacity */
      System.out.println(x + y);

      /**
       * Default capacity of StringBuilder is 16
       */
      StringBuilder sb2 = new StringBuilder();
      System.out.println(sb2.capacity());
   }
}
