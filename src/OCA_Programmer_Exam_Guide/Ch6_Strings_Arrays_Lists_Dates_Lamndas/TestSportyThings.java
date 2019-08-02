package OCA_Programmer_Exam_Guide.Ch6_Strings_Arrays_Lists_Dates_Lamndas;

/**
 * p. 375
 * OCA book
 * Arrays
 */
interface Sporty {
   void beSporty();
}

class Car {

}

class Ferrari extends Car implements Sporty {

   @Override
   public void beSporty() {
      // done
   }
}

class AthleticShoe {

}

class RacingFlats extends AthleticShoe implements Sporty {

   @Override
   public void beSporty() {
      // done
   }
}

class GolfClub {

}

public class TestSportyThings {
   public static void main(String[] args) {

      Sporty[] sportyThings = new Sporty[3];

      sportyThings[0] = new Ferrari();
      sportyThings[1] = new RacingFlats();
//      sportyThings[2] = new GolfClub(); xNC => doesn't implement Sporty
   }
}
