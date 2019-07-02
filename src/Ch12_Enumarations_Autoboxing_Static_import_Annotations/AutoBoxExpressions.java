package Ch12_Enumarations_Autoboxing_Static_import_Annotations;

/**
 * p. 441
 * Autoboxing/Unboxing occurs inside expressions
 */

public class AutoBoxExpressions {
   public static void main(String[] args) {

      Integer iOb, iOb2;
      int i;

      iOb = 99;
      System.out.println("Original value of iOb " + iOb);

      /*
       * The following automatically unboxes uOb,
       * performs the increment, and then reboxes
       * the result back to iOb.
       */
      ++iOb;
      System.out.println("After ++iOb: " + iOb);

      /*
       * Here, iOb is unboxed, its value increased by 10,
       * and the result is boxed and stored back in iOb.
       */
      iOb += 10;
      System.out.println("After iOb += 10: " + iOb);

      /*
       * Here, iOb is unboxed, the expression is evaluated,
       * and the result is reboxed and assigned to iOb2.
       */
      iOb2 = iOb + (iOb / 3);
      System.out.println("iOb2 after expression: " + iOb2);

      /*
       * The same expression is evaluated, but the
       * result is not reboxed.
       */
      i = iOb + (iOb / 3);
      System.out.println("i after expression: " + i);
   }
}
