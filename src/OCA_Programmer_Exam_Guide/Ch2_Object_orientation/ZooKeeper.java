package OCA_Programmer_Exam_Guide.Ch2_Object_orientation;

// p. 168

class Mammal {
   String name = "furry ";
   String makeNoise() { return "generic noise";}
}
class Zebra extends Mammal {
   String name = "stripes ";
   String makeNoise() {return "bray ";}
}

public class ZooKeeper {
   public static void main(String[] args) {
      new ZooKeeper().go();
   }
   void go(){
      Mammal m = new Zebra();
      System.out.println(m.name + m.makeNoise());

   }

}
