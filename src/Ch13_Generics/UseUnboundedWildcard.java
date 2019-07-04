package Ch13_Generics;

/**
 * p. 467
 * Here, the ? will match A or any class type that
 * extends A
 */

class A {
}

class B extends A {
}

class C extends A {
}

class D {
}

public class UseUnboundedWildcard {

   static void test(Gen<? extends A> o) {
      //
   }

   public static void main(String[] args) {
      A a = new A();
      B b = new B();
      C c = new C();
      D d = new D();

      Gen<A> w = new Gen<A>(a);
      Gen<B> w2 = new Gen<B>(b);
      Gen<C> w3 = new Gen<C>(c);
      Gen<D> w4 = new Gen<D>(d);

      test(w);
      test(w2);
      test(w3);

      // Can't call test() with w4, because it is not an object of a class
      // that inherits A.
//      test(w4); // Error xNC
   }
}
