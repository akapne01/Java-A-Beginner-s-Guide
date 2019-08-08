package WhizLabsTests;

/**
 * Which of the following creates a Boolean wrapper of false?
 *
 * public Boolean(String s) => allocates value true if argument is
 * 1) Is not null
 * 2) Is equal, ignoring case to string "true"
 *
 * Else allocates value of false
 */
public class Whiz2_6 {
   public static void main(String[] args) {

//   Boolean b1 = "false"; xNC string can't be assigned to boolean
      Boolean b2 = new Boolean("true"); // creates wrapper of true
      System.out.println(b2);

      Boolean b3 = new Boolean("T");
      System.out.println(b3);

      Boolean b4 = 4>3;
      System.out.println(b4);

      Boolean b5 = new Boolean("TRue");
      System.out.println(b5);

      Boolean b6 = new Boolean("Anything basically");
      System.out.println(b6);

      Boolean b7 = new Boolean(null);
      System.out.println(b7);

      System.out.println(Boolean.TRUE);
      System.out.println(Boolean.FALSE);
      System.out.println(Boolean.TYPE);
   }
}
