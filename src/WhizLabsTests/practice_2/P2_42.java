package WhizLabsTests.practice_2;

public class P2_42 {
}

class Animal {
   public void eat() throws Exception {
      System.out.println("Animal eats");
   }
}

class Dog extends Animal {
   public void eat() {
      System.out.println("Dog eats");
   }

   /**
    * Don't compile, because exception for a.eat()
    * is not handled for Animal reference object.
    * Exceptions need to be either declared or
    * handled.
    */
   public static void main(String[] args) {
      Animal a = new Dog();
      Dog d = new Dog();
      d.eat();
//      a.eat();
   }

}
