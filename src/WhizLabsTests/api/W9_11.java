package WhizLabsTests.api;

/**
 * Throws array out of bounds exception
 */
public class W9_11 {
   public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("Whizlab");
      char[] ch = new char[4];
      /** Copies characters from this sequence into destination array dst.
       * The first character to be copied is at index srcBegin; the last
       * character to be copied is at index srcEnd-1.
       * Total number of characters copied is srcEnd - srcBegin.
       * The characters are copied into the subarray of dst starting at
       * index dstBegin and ending at index.
       * dstbegin + (srcEnd - sercBegin) - 1.
       *
       * ch has 4 elements
       * 5-1 => 4 elements are copied
       * But starts at index 1, so at the end there is 1 space missing in
       * the dst array => ArrayOutOfBoundsException is thrown.
       */
      sb.getChars(1,5, ch,1);
      for(char c : ch) System.out.print(c);
   }
}
