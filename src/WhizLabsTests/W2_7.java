package WhizLabsTests;

/**
 * Integer i gets value assigned to it null and when Integer is converted into
 * double, it throws NullPointerException.
 *
 * Method .getDouble is invoked on i at runtime to convert from Integer to double,
 * therefore, NullPointerException.
 */
public class W2_7 {
   static Integer i;
   static String s;

   public static void main(String[] args) {
      Double j = 0.25;
      System.out.println(i);
      System.out.println(s);
      Double z = j + i;
      System.out.println(z);
   }
}
