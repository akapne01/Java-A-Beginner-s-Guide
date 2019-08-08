package WhizLabsTests;

class Animal {
   Animal() {
      super();
   }
}

class Bird extends Animal {

   private Bird(String name) {
      System.out.println(name);
   }

   Bird() {
      System.out.println("unknown");
   }
}

public class W4_2 {
   public static void main(String[] args) {
      /**
       * xNC, because Bird(String name) constructor is private
       */
//      new Bird("parrot");
   }
}
