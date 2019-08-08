package WhizLabsTests.inheritance;

class Person {
   Person(String s) {
      super();
   }
}

class Employee extends Person {
   /** Pass in super either null ot a String,
    * this value ignored.
    */
   Employee(String s) {
      super(null);
      System.out.println(s);
   }

   /** Invoked 1st then call other constructor of this class
    * by passing in String with value null.
    */
   Employee() {
      this("Kent");
   }
}

public class W7_11 {

   static Integer i = 0;

   public static void main(String[] args) {
      Person ab = new Employee();
//      int i = Integer.parseInt("1.0");
//      System.out.println(i);
//
      Integer i1 = null;

      /**
       * Null pointer exception thrown, because JVM converts i1 to
       * primitive type using IntValue() method that is invoked on
       * the null. NullPointerException thrown.
       */
//      System.out.println(10/i1);

//      System.out.println(i.intValue());

//      System.out.println(10%i.intValue());

      System.out.println('a');

      try {
         int x = 10;
         System.out.println(x%i.intValue());
      } catch (NullPointerException e) {
         System.out.println("E");
      } finally {
         System.out.println("F");
      }

   }
}
