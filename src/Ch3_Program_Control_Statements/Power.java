/*
  p. 83
  Compute integer powers of 2
*/

class Power {
  public static void main(String[] args) {
    int e;
    int result;

    for (int i=0; i < 10; i++) {
      result = 1;
      e = i;

      // loop inside for; multiplies 2 required number of times
      while (e > 0) {
        result *= 2;
        e--;
      }
      // still in the for
      System.out.println("2 to the " + i + " power is " + result);
    } // for
  } // main
} // class
