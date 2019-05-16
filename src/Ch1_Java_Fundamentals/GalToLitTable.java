/*
  Try This 1-2 p28 BG

  This program displays a conversion table of galons to liters.
*/

class GalToLitTable {
  public static void main(String args[]) {
    double gallons, liters;
    int counter;

    counter = 0;
    for (gallons = 1; gallons <= 100; gallons++) {
      liters = gallons * 3.7854; // convert to liters
      System.out.println(gallons + " gallons is " + liters + " liters.");

      counter++;
      // every 10th line print blank line
      if (counter == 10) {
        System.out.println();
        counter = 0; // reset the counter
      }
    }
  }
}
