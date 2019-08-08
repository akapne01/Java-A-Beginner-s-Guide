package WhizLabsTests;

/**
 * Exception thrown, as i is 2, and start counting from 0.
 * ArrayOutIfBounds
 */
public class W3_2 {
   public static void main(String[] args) {
      int i = 2;
      char array[] = new char[i];
      array[0] = 65;
      array[1] = 66;
      array[2] = 67;
      System.out.println(array[2]);


   }
}
