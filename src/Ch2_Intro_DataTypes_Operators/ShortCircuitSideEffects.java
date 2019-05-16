/*
  p54 - BG
  Side effects can be important

*/

class ShortCircuitSideEffects {
  public static void main(String[] args) {

    int i;

    i = 0;

    /*
      Here, i is still incremented even though
      the if statement fails.
    */
    if (false & (++i < 100))
      System.out.println("This won't be displayed");
    System.out.println("if statement executed: " + i); // diplays 1

    /*
      In this case it's not incremented because the short circuit
      operator skips the incremented
    */
    if (false && (++i < 100))
      System.out.println("This won't be displayed");
    System.out.println("if statement executed: " + i); // still 1

  }
}
