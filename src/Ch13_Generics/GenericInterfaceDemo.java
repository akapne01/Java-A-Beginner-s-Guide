package Ch13_Generics;

/**
 * p. 472
 * A generic containment interface. This interface implies that an implementing
 * class contains 1 or more values.
 * It declares a method called contains() that determines if a specified value is
 * contained by the invoking object.
 */

interface Containment<T> {
   /**
    * The contains() method tests if a specific item id contained
    * within an object that implements Containment.
    */
   boolean contains(T o);
}

/*
 * Implement the Containment using an array to hold the values.
 */
class MyClass<T> implements Containment<T> {

   T[] arrayRef;

   MyClass(T[] o) {
      arrayRef = o;
   }

   @Override
   public boolean contains(T o) {
      for (T x : arrayRef) {
         if (x.equals(o)) {
            return true;
         }
      }
      return false;
   }
}

public class GenericInterfaceDemo {
   public static void main(String[] args) {
      Integer x[] = {1, 2, 3};
      MyClass<Integer> ob = new MyClass<Integer>(x);

      if (ob.contains(2)) {
         System.out.println("2 is in ob");
      } else {
         System.out.println("2 is NOT on ob");
      }

      if (ob.contains(5)) {
         System.out.println("5 is in ob");
      } else {
         System.out.println("5 is NOT on ob");
      }

      /*
       * F9.25 is illegal because ob is an Integer Containment and 9.25
       * is a Double value.
       */
//      if (ob.contains(9.25)) {
//         System.out.println("9.25 is in ob"); // Illegal
//      }
   }
}

