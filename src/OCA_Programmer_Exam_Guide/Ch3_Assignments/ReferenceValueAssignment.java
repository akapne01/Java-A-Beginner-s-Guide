package OCA_Programmer_Exam_Guide.Ch3_Assignments;

/**
 * p. 190
 */

class Foo {
   public void doStuff() {
   }
}

class Bar extends Foo {
   public void doStuff() {

   }
}

public class ReferenceValueAssignment {
   public static void main(String[] args) {
      Foo reallyABar = new Bar(); // Legal, Bar is a subclass of Foo
//      Bar reallyAFoo = new Foo(); // => (xNC) Foo is not a subclass of Bar

      /**
       * Wrapper class values
       */
      Long x = new Long(42);
      Short s = new Short("57");
      System.out.println(x + " " + s);
   }
}
