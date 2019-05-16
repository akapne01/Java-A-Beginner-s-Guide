/*
  Ch1 - SelfTest - (10) - p. 31 BG

  This program displays a conversion table from Inches to Meters
  Displays 12 feet of converstion inch by inch
  1m = 39.37 inches approx.
  1 feet has 12 inches
*/

class InchesToMetersTable {
  public static void main(String args[]) {
    double inches, meters;
    int counter;

    counter = 0;
    for (inches = 1; inches <= 144; inches++) {
      meters = inches / 39.37; // convert to meters
      System.out.println(inches + " inches is " + meters + " meters.");

      counter++;
      // every 12th line print blank line
      if (counter == 12) {
        System.out.println();
        counter = 0; // reset the counter
      }
    }
  }
}
