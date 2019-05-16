/*
  p.80 - BG
  This program initializes the loop control varaible before
  the for loop itself and manually increments the loop
  control variable.
  Fot loop is missing the initalization and increment parts.
*/

class ForEmptyInitIteration {
  public static void main(String[] args) {

    int i = 0; // init loop control var

    for( ; i < 10; ) {
      System.out.println("Pass #" + i);
      i++; // increment loop control var
    }
  }
}
