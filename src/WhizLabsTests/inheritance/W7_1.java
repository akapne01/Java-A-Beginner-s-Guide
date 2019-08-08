package WhizLabsTests.inheritance;

class Bird extends Animal implements Fly {
   // code
}

interface Fly {
   // code
}

class Animal {
   // code
}

public class W7_1 {
   static Animal a = new Bird();
   static Animal b = new Animal();

   /** In this case instance of works properly, because a is actually
    * a bird object and not an animal. Bird is implementing the interface
    * so it is all good.
    */
   public static void main(String[] args) {
      System.out.println(a instanceof Fly);
      System.out.println(b instanceof Fly);

   }
}
