package Ch12_Enumarations_Autoboxing_Static_import_Annotations;

/**
 * p. 448
 * An example that used deprecated annotation
 */

@Deprecated
class DepracetedClass {
   private String msg;

   DepracetedClass(String m) {
      msg = m;
   }

   // Deprecate a method within the class
   String getMsg() {
      return msg;
   }
}

public class AnnoDemo {
   public static void main(String[] args) {
      DepracetedClass myObj = new DepracetedClass("test");

      System.out.println(myObj.getMsg());
   }
}