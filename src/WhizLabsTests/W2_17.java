package WhizLabsTests;

public class W2_17 {
   public static void main(String[] args) {

//      System.out.println(new Character("C")); xNC Character doesn't have String constructor
//      Character.valueOf("C");
//      Character.of("C");
//      Character.decode("C");
      System.out.println(new Character('a'));

      /** Throws NumberFormatException */
//      System.out.println(new Integer("One"));

      /** Float accepts double */
      Float f1 = new Float(1.2d);
      System.out.println(f1);

      /** Accepts short value in integer */
      Integer i1 = new Integer((short) 9);

      if (true)
         if (false)
            System.out.println("here"); // both true
            else System.out.println("h"); // 1st if true, 2nd false
            else System.out.println(8); // 2nd true


      final int a = 0;
      int b = 1;
      int c = 2;
      int d = 1;
      final short g = 8;
      final Integer e = 3; //  xNC if put as case
      final int f = e; // xNC if out as case

      switch (d){
         case a:
            System.out.println(a);
            break;
         case g :
            System.out.println(e);
            break;

      }


   }

}
