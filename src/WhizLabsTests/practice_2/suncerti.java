package WhizLabsTests.practice_2;

public class suncerti {
   public static void main(String[] args) {
      Integer a = new Integer(10);
      Integer b = new Integer(10);
      Long c = new Long(10);

      System.out.println(a.hashCode());
      System.out.println(b.hashCode());
      System.out.println(c.hashCode());
      System.out.println(a.toString().hashCode());
      System.out.println(a.toString().hashCode());
      System.out.println(b.toString().hashCode());
      System.out.println(c.toString().hashCode());
      System.out.println(a == a);
      System.out.println(a == b);
//      System.out.println(a == c); xNC

      if (a.toString() == b.toString()) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      if (a.toString() == c.toString()) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
   }
}

