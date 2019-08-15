package WhizLabsTests.diagnostics1;

public class WD_2 {
   public static void main(String[] args) {
      int a[] = {1, 2, 053, 4};
      int b[][] = {{1, 2, 4}, {2, 2, 1}, {0, 43, 2}};
      System.out.println(a[3] == b[0][2]); // true
      System.out.println("a[2]= " + a[2]);
      /**
       * 053 = octal. Numbers are from 0-7;
       * 53
       * 3*8^0 + 5*8^1 = 3 + 40 = 43
       */
      System.out.println("b[2][1] = " + b[2][1]);
      System.out.println("" + (a[2] == b[2][1]));
   }
}
