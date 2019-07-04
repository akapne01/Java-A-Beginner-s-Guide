package Ch13_Generics;

/**
 * p. 458
 * A simple generic class with 2 type parameters: T and V.
 */

class TwoGen<T, V> {
   T ob1;
   V ob2;

   // Pass the constructor references to objects of type T abd V.
   TwoGen(T o1, V o2) {
      ob1 = o1;
      ob2 = o2;
   }

   // Show types of T and V.
   void showTypes() {
      System.out.println("Type of T is " + ob1.getClass().getName());
      System.out.println("Type of V is " + ob2.getClass().getName());
   }

   T getOb1() {
      return ob1;
   }

   V getOb2() {
      return ob2;
   }
}

public class SimpGen {
   public static void main(String[] args) {

      // Integer is passed to T and String is passed to V.
      TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generics");

      // show the types
      tgObj.showTypes();

      // Obtain and shoe values
      int v = tgObj.getOb1();
      System.out.println("value: " + v);

      String str = tgObj.getOb2();
      System.out.println("value: " + str);
   }
}
