package ExamCloud.Q3;

public class OverloadTest1 {

   void aMethod(Object ob) {
      System.out.println("Inside---> 1");
   }

   void aMethod(String ob) {
      System.out.println("Inside---> 2");
   }

   void aMethod(Float ob) {
      System.out.println("Inside---> 3");
   }

   void aMethod(Integer ob) {
      System.out.println("Inside---> 4");
   }

   public static void main(String[] args) {
      OverloadTest1 test = new OverloadTest1();
      test.aMethod(test); // calls the Object version
      test.aMethod(test.toString()); // Calls String version
      test.aMethod(0.0); // Is autoboxed to Double object and since no Double method is available, then Object
      // version of this method will be called.
   }
}
