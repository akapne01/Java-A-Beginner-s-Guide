/**
 * p. 516
 * Demonstrate a Constructor reference
 */
package Ch14_Lambda_Expressions_Method_References;

/**
 * MyFunc is a functional interface whose method returns a MyClass reference
 */
interface MyFun {
   MyClass func(String s);
}

class MyClass {
   private String str;

   // This constructor takes an argument.
   MyClass(String s) {
      str = s;
   }

   // This is a default constructor.
   MyClass() {
      str = "";
   }

   String getStr() {
      return str;
   }
}

public class ConstructorRefDemo {
   public static void main(String[] args) {

      /**
       * Create a reference to the MyClass constructor.
       * Becasue func() in MyFunc takes an argument, new
       * refers to the parametrized constructor in MyClass,
       * not to the default constructor.
       */
      MyFun myClassCons = MyClass::new;

      // Create an instance of MyClass voa that constructor reference.
      MyClass mc = myClassCons.func("Testing");

      // Use the instance of MyClass just created.
      System.out.println("str in mc is " + mc.getStr());
   }

}
