package WhizLabsTests.practice_2;

public class P2_35 {

   public static void main(String[] args) {

      Integer i = 10;
      Double d = 10.0;
      int ii = 10;
      double dd = 10.0;

      /**
       * When using equals method with wrappers, it checks the wrapper type
       * and the wrapper primitive value. Equals method returns false, because
       * types are different.
       */
      System.out.print(i.equals(d) + " ");
      /**
       * Coparison with == using wrappers will check the actual value of the variable
       * and not the type.
       */
      System.out.print(ii == dd);

   }
}
